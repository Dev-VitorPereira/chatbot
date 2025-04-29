package com.furia.chatbot.controller;

import com.furia.chatbot.dto.CuriosidadesDTO;
import com.furia.chatbot.service.CuriosidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/curiosidades")
public class CuriosidadesController {

    @Autowired
    private CuriosidadesService curiosidadesService;

    public List<CuriosidadesDTO> listarCuriosidades(){
        return curiosidadesService.listarCuriosidades();
    }
}
