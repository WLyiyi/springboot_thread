package com.springboot_thread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync  //开启异步注解
public class SpringbootThreadApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootThreadApplication.class, args);
    }

}
