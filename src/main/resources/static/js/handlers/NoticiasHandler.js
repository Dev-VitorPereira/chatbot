// NoticiasHandler.js
const NoticiasHandler = {
    async handle(resposta) {
        // Extrai o conteúdo entre colchetes []
        const listaRegex = /\[(.*?)\]$/s;
        const match = resposta.match(listaRegex);
        if (!match) {
            ChatUI.appendMessage('Não foi possível processar a lista de notícias.', 'bot');
            return;
        }

        // Divide cada notícia por "NoticiasDTO"
        const noticiasTexto = match[1].split('NoticiasDTO').filter(n => n.trim() !== '');

        for (const noticiaStr of noticiasTexto) {
            // Extrai os campos do texto do DTO
            const campos = {};
            noticiaStr.split(',').forEach(item => {
                const [key, value] = item.split('=').map(s => s.trim());
                if (key && value) {
                    campos[key] = value.replace(']', '').trim();
                }
            });

            // Cria a mensagem formatada
            const messageElement = document.createElement('div');
            messageElement.classList.add('message', 'bot', 'noticia-item');

            const titulo = document.createElement('strong');
            titulo.textContent = campos['titulo'];

            const conteudo = document.createElement('div');
            conteudo.textContent = campos['conteudo'];

            const dataPublicacao = document.createElement('div');
            dataPublicacao.textContent = `Publicado em: ${campos['dataPublicacao']}`;

            const link = document.createElement('a');
            link.href = campos['fonteUrl'];
            link.target = '_blank';
            link.textContent = 'Leia mais';

            // Monta tudo
            messageElement.appendChild(titulo);
            messageElement.appendChild(conteudo);
            messageElement.appendChild(dataPublicacao);
            messageElement.appendChild(link);

            // Insere no chat com delay
            const chatBox = document.getElementById('chat-box');
            chatBox.appendChild(messageElement);
            chatBox.scrollTop = chatBox.scrollHeight;
            await delay(500); // Pequeno delay para suavizar
        }
    }
};
