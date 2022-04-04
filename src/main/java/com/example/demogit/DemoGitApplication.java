package com.example.demogit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGitApplication.class, args);
    }

    int getSum(int a, int b){
        return a+b;
    }
}
