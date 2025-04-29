package com.furia.chatbot.repository;

import com.furia.chatbot.model.Noticias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticiasRepository extends JpaRepository<Noticias,Long> {
   }
