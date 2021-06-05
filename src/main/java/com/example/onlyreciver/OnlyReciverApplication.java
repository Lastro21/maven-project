package com.example.onlyreciver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class OnlyReciverApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(OnlyReciverApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(OnlyReciverApplication.class);
    }
}


