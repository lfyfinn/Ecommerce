package com.skillup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcomApplication {

    public static void main (String [] args) {
        SpringApplication.run(EcomApplication.class, args);
        System.out.println("I'm Feiyang Long");
        System.out.println("test new branch");
    }
}