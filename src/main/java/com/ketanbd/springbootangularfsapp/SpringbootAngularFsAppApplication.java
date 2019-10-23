package com.ketanbd.springbootangularfsapp;

import com.ketanbd.springbootangularfsapp.Dto.UserDTO;
import com.ketanbd.springbootangularfsapp.Repository.UserJpaRepository;
import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
//@SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
@RestController
public class SpringbootAngularFsAppApplication {

    Logger mainLog = LoggerFactory.getLogger(SpringbootAngularFsAppApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAngularFsAppApplication.class, args);
    }

    // Method to get all users
    @GetMapping("/")
    public ResponseEntity<List<UserDTO>> listAllUsers() {
        // JPA method to get all users userJpaRepository.findAll();
        //List<UserDTO> allUsers =
        return null;
    }

//    Method to delete a user

//    Method to add a user

//    Method to modify a user


}
