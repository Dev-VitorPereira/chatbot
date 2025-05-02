const form = document.getElementById('chat-form');
const input = document.getElementById('user-input');
const chatBox = document.getElementById('chat-box');

// Função para adicionar mensagens ao chat
function appendMessage(message, sender) {
  const messageElement = document.createElement('div');
  messageElement.classList.add('message', sender);
  messageElement.textContent = message;
  chatBox.appendChild(messageElement);
  chatBox.scrollTop = chatBox.scrollHeight;
}

// Função que espera um tempo em milissegundos
function delay(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

// Função para carregar e exibir as opções com delay
async function carregarOpcoes() {
  try {
    const response = await fetch('http://localhost:8080/chat/opcoes');
    const opcoes = await response.json();

    appendMessage('Olá! Escolha uma das opções abaixo:', 'bot');
    await delay(1000); // Espera 1 segundo antes de começar a listar

    for (const opcao of opcoes) {
      appendMessage(`- ${opcao.texto}`, 'bot');
      await delay(1000); // Delay entre as opções
    }
  } catch (error) {
    appendMessage('Erro ao carregar as opções.', 'bot');
  }
}

// Função para processar a escolha do usuário
async function processarEscolha(escolha) {
  appendMessage(escolha, 'user');

  try {
    const response = await fetch('/chat/resposta', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ escolha: escolha })
    });

    const resposta = await response.text();
    appendMessage(resposta, 'bot');
  } catch (error) {
    appendMessage('Erro ao processar sua escolha.', 'bot');
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

// Carrega opções ao iniciar
window.onload = carregarOpcoes;

