package com.furia.chatbot.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "noticias")
public class Noticias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String conteudo;
    private String fonteUrl;
    private LocalDate dataPublicacao;

    public Noticias(Long id, String titulo, String conteudo, String fonteUrl, LocalDate dataPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.fonteUrl = fonteUrl;
        this.dataPublicacao = dataPublicacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getFonteUrl() {
        return fonteUrl;
    }

    public void setFonteUrl(String fonteUrl) {
        this.fonteUrl = fonteUrl;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}
