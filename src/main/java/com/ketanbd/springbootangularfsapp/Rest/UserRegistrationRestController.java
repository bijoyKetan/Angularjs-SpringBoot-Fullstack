package com.ketanbd.springbootangularfsapp.Rest;

import com.ketanbd.springbootangularfsapp.Repository.UserJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserRegistrationRestController {
    Logger logger = LoggerFactory.getLogger(UserRegistrationRestController.class);
    private UserJpaRepository userJpaRepository;

    @Autowired
    public void setUserJpaRepository(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }
}

