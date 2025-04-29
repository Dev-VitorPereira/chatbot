package com.furia.chatbot.controller;

import com.furia.chatbot.dto.NoticiasDTO;
import com.furia.chatbot.service.NoticiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/noticias")
public class NoticiasController {

    @Autowired
    private NoticiasService noticiasService;

    @GetMapping
    public List<NoticiasDTO> noticiasDTOList() {
        return noticiasService.listaNoticias();
    }

}
