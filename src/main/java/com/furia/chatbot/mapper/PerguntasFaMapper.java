package com.furia.chatbot.mapper;

import com.furia.chatbot.dto.PerguntasFaDTO;
import com.furia.chatbot.model.PerguntasFa;

public class PerguntasFaMapper {
    public static PerguntasFaDTO toDTO(PerguntasFa perguntas){
        return new PerguntasFaDTO(
                perguntas.getId(),
                perguntas.getTexto()
        );
    }
    public static PerguntasFa toEntity  (PerguntasFaDTO dto){
        return new PerguntasFa(
                dto.id(),
                dto.texto()
        );
    }
}
