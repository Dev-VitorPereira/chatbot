package com.furia.chatbot.mapper;

import com.furia.chatbot.dto.NoticiasDTO;
import com.furia.chatbot.model.Noticias;

public class NoticiasMapper {
    public static NoticiasDTO toDTO(Noticias noticias){
        return new NoticiasDTO(
                noticias.getId(),
                noticias.getTitulo(),
                noticias.getConteudo(),
                noticias.getFonteUrl(),
                noticias.getDataPublicacao()
        );
    }
    public static Noticias toEntity (NoticiasDTO dto){
        return new Noticias(
                dto.id(),
                dto.titulo(),
                dto.conteudo(),
                dto.fonteUrl(),
                dto.dataPublicacao()
        );
    }
}
