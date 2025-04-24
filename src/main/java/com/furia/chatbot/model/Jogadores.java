package com.furia.chatbot.model;

import jakarta.persistence.*;

@Entity
@Table (name = "jogadoresCS")

public class Jogadores {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String nickname;
    private String funcao;
    private double rating;
    private String fotoUrl;
    private String redeSocial;

    public Jogadores(Long id, String nome, String nickname, String funcao, double rating, String fotoUrl, String redeSocial) {
        this.id = id;
        this.nome = nome;
        this.nickname = nickname;
        this.funcao = funcao;
        this.rating = rating;
        this.fotoUrl = fotoUrl;
        this.redeSocial = redeSocial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public String getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(String redeSocial) {
        this.redeSocial = redeSocial;
    }
}
