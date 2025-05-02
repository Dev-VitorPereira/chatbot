
const JogadoresHandler = {
    handle(resposta) {
        // Extrai o conteúdo entre colchetes []
        const listaRegex = /\[(.*?)\]$/s;
        const match = resposta.match(listaRegex);
        if (!match) {
            ChatUI.appendMessage('Não foi possível processar a lista de jogadores.', 'bot');
            return;
        }

        // Divide cada jogador por "JogadoresDTO"
        const jogadoresTexto = match[1].split('JogadoresDTO').filter(j => j.trim() !== '');

        jogadoresTexto.forEach(jogadorStr => {
            // Extrai os campos do texto do DTO
            const campos = {};
            jogadorStr.split(',').forEach(item => {
                const [key, value] = item.split('=').map(s => s.trim());
                if (key && value) {
                    campos[key] = value.replace(']', '').trim();
                }
            });

            // Cria a mensagem formatada
            const messageElement = document.createElement('div');
            messageElement.classList.add('message', 'bot');

            // Imagem do jogador
            const img = document.createElement('img');
            img.src = campos['fotoUrl'];
            img.alt = campos['nickname'];
            img.style.width = '100px';
            img.style.borderRadius = '8px';
            img.style.display = 'block';
            img.style.marginBottom = '8px';

            // Texto do jogador
            const nome = document.createElement('strong');
            nome.textContent = `${campos['nome']} (${campos['nickname']})`;

            const funcao = document.createElement('div');
            funcao.textContent = `Função: ${campos['funcao']}`;

            const rating = document.createElement('div');
            rating.textContent = `Rating: ${campos['rating']}`;

            const link = document.createElement('a');
            link.href = campos['redeSocial'];
            link.target = '_blank';
            link.textContent = 'Perfil Social';

            // Monta tudo
            messageElement.appendChild(img);
            messageElement.appendChild(nome);
            messageElement.appendChild(funcao);
            messageElement.appendChild(rating);
            messageElement.appendChild(link);

            // Insere no chat
            const chatBox = document.getElementById('chat-box');
            chatBox.appendChild(messageElement);
            chatBox.scrollTop = chatBox.scrollHeight;
        });
    }
};
