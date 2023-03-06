package com.devsss.aoeba.web;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@ComponentScan("com.devsss.aoeba")
@EnableR2dbcRepositories("com.devsss.aoeba.service.dao")
@SpringBootApplication
@EnableEncryptableProperties
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
