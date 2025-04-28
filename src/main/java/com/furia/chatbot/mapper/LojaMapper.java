package com.furia.chatbot.mapper;

import com.furia.chatbot.dto.LojaDTO;
import com.furia.chatbot.model.Loja;

public class LojaMapper {
    public static LojaDTO toDTO(Loja loja){
        return new LojaDTO(
                loja.getId(),
                loja.getNome(),
                loja.getDescricao(),
                loja.getPreco(),
                loja.getImagemUrl(),
                loja.getCategoria()
        );
    }
    public static Loja toEntity(LojaDTO dto){
        return new Loja(
                dto.id(),
                dto.nome(),
                dto.descricao(),
                dto.preco(),
                dto.imagemUrl(),
                dto.categoria()
        );
    }
}
