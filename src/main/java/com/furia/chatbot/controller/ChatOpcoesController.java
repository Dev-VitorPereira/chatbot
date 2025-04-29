package com.furia.chatbot.controller;

import com.furia.chatbot.dto.EscolhaDTO;
import com.furia.chatbot.model.ChatOpcoes;
import com.furia.chatbot.service.ChatOpcoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("/chat")
public class ChatOpcoesController {

    @Autowired
    private ChatOpcoesService chatOpcoes;

    @GetMapping("/opcoes")
    public ResponseEntity <List<ChatOpcoes>> getChatOpcoes(){
        List<ChatOpcoes> opcoes = chatOpcoes.getOpcoes();
        return ResponseEntity.ok(opcoes);
    }

    @PostMapping("/resposta")
    public ResponseEntity<String> processoEscolha(@RequestBody EscolhaDTO dto){
        if (dto.getEscolha() == null || dto.getEscolha().trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Erro: Campo 'escolha' está ausente ou vazio.");
        }

        String resposta = chatOpcoes.processoEscolha(dto.getEscolha());
        return ResponseEntity.ok(resposta);
    }

}

