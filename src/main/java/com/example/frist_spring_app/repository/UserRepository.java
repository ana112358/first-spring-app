package com.example.frist_spring_app.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.frist_spring_app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,UUID>{

    
}
