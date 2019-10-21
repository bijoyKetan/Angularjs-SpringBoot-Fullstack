package com.ketanbd.springbootangularfsapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
@RestController
public class SpringbootAngularFsAppApplication {

    Logger mainLog = LoggerFactory.getLogger(SpringbootAngularFsAppApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAngularFsAppApplication.class, args);
    }

    @RequestMapping("/hello")
    public String sayHello() {
        mainLog.info("The main page started");
        return ("Hello world!");
    }

}
