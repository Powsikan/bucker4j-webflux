package com.example.backet4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Backet4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(Backet4jApplication.class, args);
    }

}
