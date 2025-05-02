// chatService.js
const ChatService = {
    async carregarOpcoes() {
        const response = await fetch('http://localhost:8080/chat/opcoes');
        return await response.json();
    },

    async enviarEscolha(escolha) {
        const response = await fetch('/chat/resposta', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ escolha: escolha })
        });
        return await response.text();
    }
};
