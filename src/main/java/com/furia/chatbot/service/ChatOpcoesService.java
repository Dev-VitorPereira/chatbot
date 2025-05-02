package com.furia.chatbot.service;

import com.furia.chatbot.model.ChatOpcoes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatOpcoesService {

    @Autowired
    private NoticiasService noticiasService;
    @Autowired
    private LojaService lojaService;
    @Autowired
    private CuriosidadesService curiosidadesService;
    @Autowired
    private ProximosJogosService proximosJogosService;
    @Autowired
    private JogadoresService jogadoresService;

    public List<ChatOpcoes> getOpcoes() {
        List<ChatOpcoes> opcoes = new ArrayList<>();
        opcoes.add(new ChatOpcoes("Curiosidades sobre a FURIA", "curiosidades"));
        opcoes.add(new ChatOpcoes("Últimas Notícias", "noticias"));
        opcoes.add(new ChatOpcoes("Jogadores de CS", "jogadores"));
        opcoes.add(new ChatOpcoes("Loja", "loja"));
        opcoes.add(new ChatOpcoes("Próximos Jogos", "jogos"));

        return opcoes;
    }

    public String processoEscolha(String escolha) {
        if (escolha == null) {
            return "Erro: Nenhuma opção foi selecionada.";
        }

        switch (escolha) {
            case "curiosidades":
                return "Aqui estão algumas curiosidades sobre a FURIA!" + "\n" + curiosidadesService.listarCuriosidades();
            case "noticias":
                return "Aqui estão as últimas notícias sobre a FURIA!" + "\n" + noticiasService.listaNoticias();
            case "jogadores":
                return "Aqui estão os jogadores de CS da FURIA!" + "\n" + jogadoresService.listaJogadores();
            case "loja":
                return "Aqui estão os item da Loja da FURIA" + "\n" + lojaService.listaLoja();
            case "proximosJogos":
                return "Confira os próximos jogos da FURIA!" + "\n" + proximosJogosService.listarProximosJogos();
            default:
                return "Opção inválida!";
        }
    }
}
