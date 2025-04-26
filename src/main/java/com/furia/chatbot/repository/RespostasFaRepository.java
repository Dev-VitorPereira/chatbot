package com.furia.chatbot.repository;

import com.furia.chatbot.model.RespostasFa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespostasFaRepository extends JpaRepository <RespostasFa, Long> {
}
