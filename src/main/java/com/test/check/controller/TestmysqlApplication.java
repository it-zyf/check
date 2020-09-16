package com.test.check.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
//@EnableAsync
public class TestmysqlApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestmysqlApplication.class, args);
    }
}