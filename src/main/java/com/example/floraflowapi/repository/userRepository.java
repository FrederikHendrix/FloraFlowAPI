package com.example.floraflowapi.repository;

import com.example.floraflowapi.entity.users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<users,Integer> {
}
