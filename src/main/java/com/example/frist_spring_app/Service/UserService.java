package com.example.frist_spring_app.Service;

import java.time.Instant;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.frist_spring_app.controller.CreateUserDto;
import com.example.frist_spring_app.entity.User;
import com.example.frist_spring_app.repository.UserRepository;

import lombok.var;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;

    }

    public UUID createUser(CreateUserDto createUserDto){
        //DTO converter par aENtity
        var entity =  new User(
            UUID.randomUUID(),
            createUserDto.email(),
            createUserDto.password(),
            createUserDto.username(),
            Instant.now(),
            null
        );
        
       var userSaved =  userRepository.save(entity);

       return userSaved.getUserID();
    }
    
}
