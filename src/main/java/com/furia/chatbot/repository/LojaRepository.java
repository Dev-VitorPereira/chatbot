package com.furia.chatbot.repository;

import com.furia.chatbot.model.Loja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LojaRepository extends JpaRepository <Loja, Long> {
}
