package com.example.joopdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.joopdemo")
public class JoopDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoopDemoApplication.class, args);
    }

}
