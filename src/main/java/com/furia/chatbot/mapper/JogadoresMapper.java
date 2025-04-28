package com.furia.chatbot.mapper;

import com.furia.chatbot.dto.JogadoresDTO;
import com.furia.chatbot.model.Jogadores;

public class JogadoresMapper {
    public static JogadoresDTO toDTO(Jogadores jogadores) {
        return new JogadoresDTO(
                jogadores.getId(),
                jogadores.getNome(),
                jogadores.getNickname(),
                jogadores.getFuncao(),
                jogadores.getRating(),
                jogadores.getFotoUrl(),
                jogadores.getRedeSocial()
        );
    }
    public static Jogadores toEntity(JogadoresDTO dto){
        return new Jogadores(
                dto.id(),
                dto.nome(),
                dto.nickname(),
                dto.funcao(),
                dto.rating(),
                dto.fotoUrl(),
                dto.redeSocial()
        );
    }
}
