package com.furia.chatbot.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record ProximosJogosDTO(
        Long id,
        String adversario,
        LocalDate dataJogo,
        LocalTime horaJogo,
        String torneio,
        String local,
        String status

) {
}
