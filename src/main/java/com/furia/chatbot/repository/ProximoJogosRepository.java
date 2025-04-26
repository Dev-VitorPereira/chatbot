package com.furia.chatbot.repository;

import com.furia.chatbot.model.ProximosJogos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProximoJogosRepository extends JpaRepository<ProximosJogos, Long> {
}
