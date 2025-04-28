package com.furia.chatbot.mapper;

import com.furia.chatbot.dto.PerguntasFaDTO;
import com.furia.chatbot.dto.RespostasFaDTO;
import com.furia.chatbot.model.PerguntasFa;
import com.furia.chatbot.model.RespostasFa;

public class RepostasFaMapper {
    public static RespostasFaDTO toDTO (RespostasFa respostas){
        return new RespostasFaDTO(
                respostas.getId(),
                respostas.getTexto(),
                respostas.isCorreta()
        );
    }
    public static RespostasFa toEntity (RespostasFaDTO dto){
        return new RespostasFa(
                dto.id(),
                dto.texto(),
                dto.correta()
        );
    }
}
