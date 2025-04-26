package com.furia.chatbot.dto;

import java.time.LocalDate;

public record NoticiasDTO(
        Long id,
        String titulo,
        String conteudo,
        String fonteUrl,
        LocalDate dataPublicacao
) { }
