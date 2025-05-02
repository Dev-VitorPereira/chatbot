const LojaHandler = {
    handle(resposta) {
        // Extrai o conteúdo entre colchetes []
        const listaRegex = /\[(.*?)\]$/s;
        const match = resposta.match(listaRegex);
        if (!match) {
            ChatUI.appendMessage('Não foi possível processar a lista da loja.', 'bot');
            return;
        }

        // Divide cada item da loja por "LojaDTO"
        const lojaTexto = match[1].split('LojaDTO').filter(item => item.trim() !== '');

        lojaTexto.forEach(itemStr => {
            // Extrai os campos do texto do DTO
            const campos = {};
            itemStr.split(',').forEach(item => {
                const [key, value] = item.split('=').map(s => s.trim());
                if (key && value) {
                    campos[key] = value.replace(']', '').trim();
                }
            });

            // Cria a mensagem formatada
            const messageElement = document.createElement('div');
            messageElement.classList.add('message', 'bot', 'loja');

            // Imagem do produto
            const img = document.createElement('img');
            img.src = campos['imagemUrl'];
            img.alt = campos['nome'];
            img.style.width = '150px';
            img.style.borderRadius = '8px';
            img.style.display = 'block';
            img.style.marginBottom = '8px';

            // Título do produto
            const titulo = document.createElement('strong');
            titulo.textContent = `${campos['nome']}`;

            // Descrição
            const descricao = document.createElement('div');
            descricao.classList.add('descricao');
            descricao.textContent = `${campos['descricao']}`;

            // Preço
            const preco = document.createElement('div');
            preco.textContent = `Preço: R$ ${parseFloat(campos['preco']).toFixed(2)}`;

            // Categoria
            const categoria = document.createElement('div');
            categoria.classList.add('categoria');
            categoria.textContent = `Categoria: ${campos['categoria']}`;

            // Monta tudo
            messageElement.appendChild(img);
            messageElement.appendChild(titulo);
            messageElement.appendChild(descricao);
            messageElement.appendChild(preco);
            messageElement.appendChild(categoria);

            // Insere no chat
            const chatBox = document.getElementById('chat-box');
            chatBox.appendChild(messageElement);
            chatBox.scrollTop = chatBox.scrollHeight;
        });
    }
};
