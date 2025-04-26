package com.furia.chatbot.dto;

public record JogadoresDTO(
        Long id,
        String nome,
        String nickname,
        String funcao,
        double rating,
        String fotoUrl,
        String redeSocial
) { }
