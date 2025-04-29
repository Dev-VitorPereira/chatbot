package com.furia.chatbot.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table (name = "proximos_jogos")

public class ProximosJogos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String adversario;
    private LocalDate dataJogo;
    private LocalTime horaJogo;
    private String torneio;
    private String local;
    private String status;

    public ProximosJogos(){

    }
    public ProximosJogos(Long id, String adversario, LocalDate dataJogo, LocalTime horaJogo, String torneio, String local, String status) {
        this.id = id;
        this.adversario = adversario;
        this.dataJogo = dataJogo;
        this.horaJogo = horaJogo;
        this.torneio = torneio;
        this.local = local;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdversario() {
        return adversario;
    }

    public void setAdversario(String adversario) {
        this.adversario = adversario;
    }

    public LocalDate getDataJogo() {
        return dataJogo;
    }

    public void setDataJogo(LocalDate dataJogo) {
        this.dataJogo = dataJogo;
    }

    public LocalTime getHoraJogo() {
        return horaJogo;
    }

    public void setHoraJogo(LocalTime horaJogo) {
        this.horaJogo = horaJogo;
    }

    public String getTorneio() {
        return torneio;
    }

    public void setTorneio(String torneio) {
        this.torneio = torneio;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
