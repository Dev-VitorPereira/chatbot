// Função para esperar um tempo em milissegundos
function delay(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
}

// Função para formatar uma data para um formato legível
function formatDate(dateString) {
    const date = new Date(dateString);
    const options = {
        year: 'numeric',
        month: 'long',
        day: 'numeric',
        hour: 'numeric',
        minute: 'numeric',
        second: 'numeric',
        hour12: true
    };
    return date.toLocaleDateString('pt-BR', options);
}

// Função para gerar um ID único (exemplo simples usando a hora atual)
function generateUniqueId() {
    return 'id-' + new Date().getTime();
}

// Função para tratar erro na API e exibir mensagem
function handleError(error) {
    console.error(error);
    return "Ocorreu um erro. Tente novamente mais tarde.";
}

// Função para formatar uma mensagem de resposta do bot de maneira legível
function formatBotMessage(message) {
    return message.charAt(0).toUpperCase() + message.slice(1) + '.'; // Ex: "aqui estão os jogadores" -> "Aqui estão os jogadores."
}
