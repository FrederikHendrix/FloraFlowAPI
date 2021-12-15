package com.example.floraflowapi.service;

import com.example.floraflowapi.entity.arduinoplant;
import org.springframework.stereotype.Service;
import com.example.floraflowapi.repository.arduinoplantRepository;


import java.util.List;

@Service
public class arduinoplantService {

    private final arduinoplantRepository arduinoplantRepository;

    public arduinoplantService(com.example.floraflowapi.repository.arduinoplantRepository arduinoplantRepository) {
        this.arduinoplantRepository = arduinoplantRepository;
    }


    public List<arduinoplant> getArduinoPlant() {
        return arduinoplantRepository.findAll();
    }
    public arduinoplant getArduinoPlantById(int id){
        return arduinoplantRepository.findById(id).orElse(null);
    }

    public arduinoplant saveArduinoPlant(arduinoplant arduinoplant){
        return arduinoplantRepository.save(arduinoplant);
    }

    public arduinoplant updateArduinoPlant(arduinoplant arduinoplant){
        arduinoplant existingArduinoPlant = arduinoplantRepository.findById(arduinoplant.getId()).orElse(null);
        existingArduinoPlant.setName(arduinoplant.getName());
        existingArduinoPlant.setHumidity(arduinoplant.getHumidity());
        existingArduinoPlant.setLightsensor(arduinoplant.getLightsensor());
        existingArduinoPlant.setPlantstate(arduinoplant.getPlantstate());
        existingArduinoPlant.setPumpstate(arduinoplant.getPumpstate());
        return arduinoplantRepository.save(existingArduinoPlant);
    }
}
