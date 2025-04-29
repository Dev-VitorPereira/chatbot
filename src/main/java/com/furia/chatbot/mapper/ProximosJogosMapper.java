package com.furia.chatbot.mapper;

import com.furia.chatbot.dto.ProximosJogosDTO;
import com.furia.chatbot.model.ProximosJogos;
import org.springframework.stereotype.Component;

@Component
public class ProximosJogosMapper {
    public static ProximosJogosDTO toDTO(ProximosJogos proximosJogos){
        return new ProximosJogosDTO(
                proximosJogos.getId(),
                proximosJogos.getAdversario(),
                proximosJogos.getDataJogo(),
                proximosJogos.getHoraJogo(),
                proximosJogos.getTorneio(),
                proximosJogos.getLocal(),
                proximosJogos.getStatus()
        );
    }
    public static ProximosJogos toEntity (ProximosJogosDTO dto){
        return new ProximosJogos(
                dto.id(),
                dto.adversario(),
                dto.dataJogo(),
                dto.horaJogo(),
                dto.torneio(),
                dto.local(),
                dto.status()
        );
    }
}
