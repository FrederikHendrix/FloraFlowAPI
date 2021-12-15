package com.example.floraflowapi.repository;

import com.example.floraflowapi.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user,Integer> {
}
