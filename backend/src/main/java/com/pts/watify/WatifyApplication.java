package com.pts.watify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WatifyApplication {

    public static void main(String[] args) {
        SpringApplication.run(WatifyApplication.class, args);
    }

}
