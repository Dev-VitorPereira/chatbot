package com.furia.chatbot.repository;

import com.furia.chatbot.model.PerguntasFa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerguntasFaRepository extends JpaRepository <PerguntasFa, Long> {
}
