package com.abprogramming;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.abprogramming.mapper")
public class EnglishServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnglishServerApplication.class, args);
    }

}
