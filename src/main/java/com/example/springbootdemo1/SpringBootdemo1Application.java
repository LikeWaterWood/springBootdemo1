package com.example.springbootdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan("com.example.springbootdemo1.filter")
public class SpringBootdemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootdemo1Application.class, args);
    }

}
