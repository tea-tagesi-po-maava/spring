package com.example.myapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication(exclude = R2dbcAutoConfiguration.class)
@ComponentScan(basePackages = "com.example.myapplication") // Ensure that the packages from DemoApp are scanned
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}
