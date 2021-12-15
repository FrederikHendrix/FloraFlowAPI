package com.example.floraflowapi.service;

import com.example.floraflowapi.entity.arduino;
import org.springframework.stereotype.Service;
import com.example.floraflowapi.repository.arduinoRepository;

import java.util.List;

@Service
public class arduinoService {

    private final arduinoRepository arduinoRepository;

    public arduinoService(com.example.floraflowapi.repository.arduinoRepository arduinoRepository) {
        this.arduinoRepository = arduinoRepository;
    }


    public List<arduino> getArduino() {
        return arduinoRepository.findAll();
    }
}
