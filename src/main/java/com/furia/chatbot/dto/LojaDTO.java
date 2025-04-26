package com.furia.chatbot.dto;

public record LojaDTO(
        Long id,
        String nome,
        String descricao,
        double preco,
        String imagemUrl,
        String categoria
) { }
