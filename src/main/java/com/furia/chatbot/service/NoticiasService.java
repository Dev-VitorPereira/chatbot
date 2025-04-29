package com.furia.chatbot.service;

import com.furia.chatbot.dto.NoticiasDTO;
import com.furia.chatbot.mapper.NoticiasMapper;
import com.furia.chatbot.model.Noticias;
import com.furia.chatbot.repository.NoticiasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NoticiasService {


    @Autowired
    private NoticiasRepository noticiasRepository;

    public List<NoticiasDTO> listaNoticias() {
        return noticiasRepository.findAll().stream()
                .map(NoticiasMapper::toDTO)
                .collect(Collectors.toList());
    }
}
