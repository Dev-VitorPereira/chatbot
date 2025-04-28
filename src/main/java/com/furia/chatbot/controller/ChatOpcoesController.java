package com.furia.chatbot.controller;

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
    public ResponseEntity<String> processoEscolha(@RequestBody Map<String, String> escolhaMap){
        String escolha = escolhaMap.get("escolha");
        String resposta = chatOpcoes.processoEscolha(escolha);
        return ResponseEntity.ok(resposta);

    }
}

