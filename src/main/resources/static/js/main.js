// main.js
const form = document.getElementById('chat-form');
const input = document.getElementById('user-input');

// Função que espera um tempo em milissegundos
function delay(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
}

// Carregar opções ao iniciar
async function carregarOpcoes() {
    try {
        const opcoes = await ChatService.carregarOpcoes();
        ChatUI.appendMessage('Olá! Escolha uma das opções abaixo:', 'bot');
        await delay(1000);
        for (const opcao of opcoes) {
            ChatUI.appendMessage(`- ${opcao.texto}`, 'bot');
            await delay(1000);
        }
    } catch (error) {
        ChatUI.appendMessage('Erro ao carregar as opções.', 'bot');
    }
}

// Processar a escolha do usuário
async function processarEscolha(escolha) {
    ChatUI.appendMessage(escolha, 'user');
    try {
        const resposta = await ChatService.enviarEscolha(escolha);

        const escolhaLower = escolha.toLowerCase();
        if (escolhaLower.includes('jogadores')) {
            JogadoresHandler.handle(resposta);
        } else {
            // Caso não tenha handler específico ainda
            ChatUI.appendMessage(resposta, 'bot');
        }
    } catch (error) {
        ChatUI.appendMessage('Erro ao processar sua escolha.', 'bot');
    }
}

// Captura o envio do formulário
form.addEventListener('submit', function (e) {
    e.preventDefault();
    const escolha = input.value.trim();
    if (escolha) {
        processarEscolha(escolha);
        input.value = '';
    }
});

// Inicia o carregamento das opções
window.onload = carregarOpcoes;
