package com.furia.chatbot.controller;

import com.furia.chatbot.dto.LojaDTO;
import com.furia.chatbot.mapper.LojaMapper;
import com.furia.chatbot.service.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping ("/loja")
public class LojaController {

    @Autowired
    private LojaService lojaService;

    @GetMapping
    public List <LojaDTO> listarLoja(){
        return lojaService.listaLoja();
    }

}
