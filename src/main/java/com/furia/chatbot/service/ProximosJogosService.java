package com.furia.chatbot.service;

import com.furia.chatbot.repository.ProximoJogosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProximosJogosService {

    @Autowired
    private ProximoJogosRepository proximoJogosRepository;

    public List<ProximosJogosDTO> listarProximosJogos(){
        return proximoJogosRepository.findAll()
                .stream()
                .map(ProximosJogosMapper::toDTO)
                .collect(Collectors.toList());
    }
}
