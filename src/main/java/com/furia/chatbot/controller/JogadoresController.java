package com.furia.chatbot.controller;

import com.furia.chatbot.dto.JogadoresDTO;
import com.furia.chatbot.service.JogadoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/jogadores")
public class JogadoresController {

    @Autowired
    private JogadoresService jogadoresService;

    public List <JogadoresDTO> listarJogadores(){
        return jogadoresService.listaJogadores();
    }
}
