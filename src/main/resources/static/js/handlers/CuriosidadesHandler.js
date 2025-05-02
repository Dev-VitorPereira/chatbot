// js/CuriosidadesHandler.js
const CuriosidadesHandler = {
    async handle(resposta) {
        // Extrai o conteúdo entre colchetes []
        const listaRegex = /\[(.*?)\]$/s;
        const match = resposta.match(listaRegex);
        if (!match) {
            ChatUI.appendMessage('Não foi possível processar a lista de curiosidades.', 'bot');
            return;
        }

        // Divide cada curiosidade por "CuriosidadesDTO"
        const curiosidadesTexto = match[1].split('CuriosidadesDTO').filter(c => c.trim() !== '');

        for (const curiosidadeStr of curiosidadesTexto) {
            // Extrai os campos do texto do DTO
            const campos = {};
            curiosidadeStr.split(',').forEach(item => {
                const [key, value] = item.split('=').map(s => s.trim());
                if (key && value) {
                    campos[key] = value.replace(']', '').trim();
                }
            });

            // Cria a mensagem formatada
            const messageElement = document.createElement('div');
            messageElement.classList.add('message', 'bot', 'curiosidade-message');

            const titulo = document.createElement('strong');
            titulo.textContent = campos['titulo'];

            const descricao = document.createElement('p');
            descricao.textContent = campos['descricao'];

            const categoria = document.createElement('div');
            categoria.textContent = `Categoria: ${campos['categoria']}`;

            // Monta tudo
            messageElement.appendChild(titulo);
            messageElement.appendChild(descricao);
            messageElement.appendChild(categoria);

            // Insere no chat
            const chatBox = document.getElementById('chat-box');
            chatBox.appendChild(messageElement);
            chatBox.scrollTop = chatBox.scrollHeight;

            // Delay entre cada curiosidade
            await delay(700);
        }
    }
};
