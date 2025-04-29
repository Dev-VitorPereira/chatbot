const form = document.getElementById('chat-form');
const input = document.getElementById('user-input');
const chatBox = document.getElementById('chat-box');

// Função para carregar as opções do chat quando o usuário entrar
async function carregarOpcoes() {
  try {
    // Requisição GET para obter as opções de escolha (curiosidades, notícias, jogadores, etc.)
    const response = await fetch('http://localhost:8080/chat/opcoes');

    const opcoes = await response.json();

    // Exibe as opções no chat, cada uma é clicável
    opcoes.forEach(opcao => {
      const optionElement = document.createElement('div');
      optionElement.classList.add('message', 'bot');
      optionElement.textContent = opcao.texto;
      optionElement.addEventListener('click', () => processarEscolha(opcao.valor)); // Processa a escolha quando clicada
      chatBox.appendChild(optionElement);
    });
  } catch (error) {
    appendMessage('Erro ao carregar as opções.', 'bot');
  }
}

// Função para processar a escolha do usuário e obter a resposta do back-end
async function processarEscolha(escolha) {
  appendMessage(escolha, 'user');  // Exibe a escolha do usuário no chat

  try {
    // Envia a escolha para o back-end (via POST)
    const response = await fetch('/chat/resposta', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ escolha: escolha })  // Envia o corpo da requisição com a escolha
    });

    // Obtém a resposta do back-end
    const resposta = await response.text();
    appendMessage(resposta, 'bot');  // Exibe a resposta do back-end no chat
  } catch (error) {
    appendMessage('Erro ao processar sua escolha.', 'bot');
  }
}

// Função para adicionar mensagens no chat
function appendMessage(message, sender) {
  const messageElement = document.createElement('div');
  messageElement.classList.add('message', sender);  // Define se é uma mensagem do usuário ou do bot
  messageElement.textContent = message;
  chatBox.appendChild(messageElement);
  chatBox.scrollTop = chatBox.scrollHeight;  // Faz o chat rolar até a última mensagem
}

// Carregar opções assim que a página for carregada
window.onload = carregarOpcoes;
