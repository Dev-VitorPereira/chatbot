package com.furia.chatbot.model;

import jakarta.persistence.*;

@Entity
@Table (name = "Respostas")
public class RespostasFa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String texto;     // Texto da alternativa
    private boolean correta;  // Essa alternativa é a correta?

    @ManyToOne
    @JoinColumn(name = "pergunta_id")
    private PerguntasFa pergunta;

    public RespostasFa(Long id, String texto, boolean correta) {
        this.id = id;
        this.texto = texto;
        this.correta = correta;
        this.pergunta = pergunta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isCorreta() {
        return correta;
    }

    public void setCorreta(boolean correta) {
        this.correta = correta;
    }

    public PerguntasFa getPergunta() {
        return pergunta;
    }

    public void setPergunta(PerguntasFa pergunta) {
        this.pergunta = pergunta;
    }
}