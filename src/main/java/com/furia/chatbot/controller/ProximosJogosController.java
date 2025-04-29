package com.furia.chatbot.controller;

import com.furia.chatbot.dto.ProximosJogosDTO;
import com.furia.chatbot.service.ProximosJogosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/proximos-jogos")
public class ProximosJogosController {

    @Autowired
    private ProximosJogosService proximosJogosService;

    public List <ProximosJogosDTO> listarProximosJogos (){
        return proximosJogosService.listarProximosJogos();
    }
}
