package com.furia.chatbot.mapper;

import com.furia.chatbot.dto.CuriosidadesDTO;
import com.furia.chatbot.model.Curiosidades;

public class CuriosidadesMapper {

    public static CuriosidadesDTO toDTO(Curiosidades curiosidades){
        return new CuriosidadesDTO(
                curiosidades.getId(),
                curiosidades.getTitulo(),
                curiosidades.getDescricao(),
                curiosidades.getCategoria()
        );
    }
    public static Curiosidades toEntity(CuriosidadesDTO dto){
        return new Curiosidades(
                dto.id(),
                dto.titulo(),
                dto.descricao(),
                dto.categoria()
        );
    }
}
