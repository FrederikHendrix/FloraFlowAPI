package com.example.floraflowapi.service;

import com.example.floraflowapi.entity.user;
import com.example.floraflowapi.repository.userRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    private final userRepository userRepository;

    public userService(com.example.floraflowapi.repository.userRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<user> getUser(){
        return userRepository.findAll();
    }
}
