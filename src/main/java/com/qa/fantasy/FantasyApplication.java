package com.qa.fantasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@SpringBootApplication
public class FantasyApplication {

    public static void main(String[] args) {
        SpringApplication.run(FantasyApplication.class, args);
        System.out.println("#########" + ServletUriComponentsBuilder.fromCurrentContextPath() + "##############");
    }
}
