package com.furia.chatbot.service;

import com.furia.chatbot.dto.CuriosidadesDTO;
import com.furia.chatbot.mapper.CuriosidadesMapper;
import com.furia.chatbot.repository.CuriosidadesRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CuriosidadesService {

    @Autowired
    private CuriosidadesRepositoy curiosidadesRepositoy;

    public List<CuriosidadesDTO> listarCuriosidades(){
        return curiosidadesRepositoy.findAll()
                .stream()
                .map(CuriosidadesMapper::toDTO)
                .collect(Collectors.toList());
    }
}
