package com.bikalp.myplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.annotation.Validated;

@SpringBootApplication
@EnableTransactionManagement
@Validated
public class MyPlaygroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyPlaygroundApplication.class, args);
    }
}
