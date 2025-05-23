package com.furia.chatbot.repository;

import com.furia.chatbot.model.Jogadores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogadoresRepository extends JpaRepository<Jogadores, Long> {
}
