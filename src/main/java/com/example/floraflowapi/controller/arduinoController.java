package com.example.floraflowapi.controller;

import com.example.floraflowapi.entity.arduino;
import com.example.floraflowapi.service.arduinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class arduinoController {

    @Autowired
    private arduinoService service;

    @GetMapping(value = "arduino")
        public List<arduino> findAllProducts() {
            return service.getArduino();
        }
    }

