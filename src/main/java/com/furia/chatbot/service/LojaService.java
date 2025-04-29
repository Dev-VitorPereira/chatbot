package com.furia.chatbot.service;

import com.furia.chatbot.dto.LojaDTO;
import com.furia.chatbot.mapper.LojaMapper;
import com.furia.chatbot.repository.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LojaService {

    @Autowired
    private LojaRepository lojaRepository;

    public List<LojaDTO> listaLoja(){
        return lojaRepository.findAll()
                .stream()
                .map(LojaMapper::toDTO)
                .collect(Collectors.toList());
    }
}
