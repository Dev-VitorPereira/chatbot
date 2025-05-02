// ProximosJogosHandler.js
const ProximosJogosHandler = {
    async handle(resposta) {
        // Extrai o conteúdo entre colchetes []
        const listaRegex = /\[(.*?)\]$/s;
        const match = resposta.match(listaRegex);
        if (!match) {
            ChatUI.appendMessage('Não foi possível processar a lista de próximos jogos.', 'bot');
            return;
        }

        // Divide cada jogo por "ProximosJogosDTO"
        const jogosTexto = match[1].split('ProximosJogosDTO').filter(j => j.trim() !== '');

        for (const jogoStr of jogosTexto) {
            // Extrai os campos do texto do DTO
            const campos = {};
            jogoStr.split(',').forEach(item => {
                const [key, value] = item.split('=').map(s => s.trim());
                if (key && value) {
                    campos[key] = value.replace(']', '').trim();
                }
            });

            // Cria a mensagem formatada
            const messageElement = document.createElement('div');
            messageElement.classList.add('message', 'bot', 'game-item');

            const adversario = document.createElement('strong');
            adversario.textContent = `VS ${campos['adversario']}`;

            const torneio = document.createElement('div');
            torneio.textContent = `Torneio: ${campos['torneio']}`;

            const dataHora = document.createElement('div');
            dataHora.textContent = `Data: ${campos['dataJogo']} às ${campos['horaJogo']}`;

            const local = document.createElement('div');
            local.textContent = `Local: ${campos['local']}`;

            const status = document.createElement('div');
            status.textContent = `Status: ${campos['status']}`;

            // Monta tudo
            messageElement.appendChild(adversario);
            messageElement.appendChild(torneio);
            messageElement.appendChild(dataHora);
            messageElement.appendChild(local);
            messageElement.appendChild(status);

            // Insere no chat com delay
            const chatBox = document.getElementById('chat-box');
            chatBox.appendChild(messageElement);
            chatBox.scrollTop = chatBox.scrollHeight;
            await delay(500); // Pequeno delay entre cada jogo para suavizar a exibição
        }
    }
};
