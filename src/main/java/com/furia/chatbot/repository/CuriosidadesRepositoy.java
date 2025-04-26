package com.furia.chatbot.repository;

import com.furia.chatbot.model.Curiosidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuriosidadesRepositoy extends JpaRepository <Curiosidades, Long> {
}
