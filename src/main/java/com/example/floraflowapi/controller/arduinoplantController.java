package com.example.floraflowapi.controller;


import com.example.floraflowapi.entity.arduinoplant;
import com.example.floraflowapi.service.arduinoplantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class arduinoplantController {

    @Autowired
    private arduinoplantService service;

    @PutMapping(value = "/put/arduinoplant")
    public arduinoplant updateProduct(@RequestBody arduinoplant arduinoplant){
        return service.updateArduinoPlant(arduinoplant);
    }

    @PostMapping(value = "/post/arduinoplant")
    public arduinoplant saveArduinoPlant(@RequestBody arduinoplant arduinoplant){
        return service.saveArduinoPlant(arduinoplant);
    }

    @GetMapping(value = "/get/arduinoplant")
    public List<arduinoplant> findAllProducts(){
        return service.getArduinoPlant();
    }

    @GetMapping(value = "/get/arduinoplant/{id}")
    public arduinoplant findArduinoPlantById(@PathVariable int id){
        return service.getArduinoPlantById(id);
    }

    @DeleteMapping(value = "/delete/arduinoplant/{id}")
    public String deleteArduinoPlantById(@PathVariable int id){
        service.deleteArduinoPlant(id);
        return "Delete" + id;
    }
}
