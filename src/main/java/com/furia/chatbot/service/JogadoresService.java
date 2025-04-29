package com.furia.chatbot.service;

import com.furia.chatbot.dto.JogadoresDTO;
import com.furia.chatbot.dto.LojaDTO;
import com.furia.chatbot.mapper.JogadoresMapper;
import com.furia.chatbot.repository.JogadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JogadoresService {

    @Autowired
    private JogadoresRepository jogadoresRepository;

    public List<JogadoresDTO> listaJogadores(){
        return jogadoresRepository.findAll()
                .stream()
                .map(JogadoresMapper::toDTO)
                .collect(Collectors.toList());
    }
}
