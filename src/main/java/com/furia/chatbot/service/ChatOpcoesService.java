package com.furia.chatbot.service;

import com.furia.chatbot.model.ChatOpcoes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatOpcoesService {

    @Autowired
    private  NoticiasService noticiasService;

    public List<ChatOpcoes> getOpcoes() {
        List<ChatOpcoes> opcoes = new ArrayList<>();
        opcoes.add(new ChatOpcoes("Curiosidades sobre a FURIA", "curiosidades"));
        opcoes.add(new ChatOpcoes("Últimas Notícias", "noticias"));
        opcoes.add(new ChatOpcoes("Jogadores de CS", "jogadores"));
        opcoes.add(new ChatOpcoes("Loja", "loja"));
        opcoes.add(new ChatOpcoes("Próximos Jogos", "proximosJogos"));

        return opcoes;
    }

    public String processoEscolha(String escolha) {
        switch (escolha) {
            case "curiosidades":
                return "Aqui estão algumas curiosidades sobre a FURIA!";
            case "noticias":
                return "Aqui estão as últimas notícias sobre a FURIA!" + "\n" + noticiasService.listaNoticias() ;
            case "jogadores":
                return "Aqui estão os jogadores de CS da FURIA!";
            case "loja":
                return "A loja está em construção!";
            case "proximosJogos":
                return "Confira os próximos jogos da FURIA!";
            default:
                return "Opção inválida!";
        }
    }
}
