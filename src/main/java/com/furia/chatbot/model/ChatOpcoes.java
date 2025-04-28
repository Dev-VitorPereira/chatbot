package com.furia.chatbot.model;

public class ChatOpcoes {
    private String texto;
    private String acao;

    public ChatOpcoes(String texto, String acao) {
        this.texto = texto;
        this.acao = acao;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }
}
