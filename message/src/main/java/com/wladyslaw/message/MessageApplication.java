package com.wladyslaw.message;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class MessageApplication {

    @Value("${my.application}")
    private static String app;

    public static void main(String[] args) {
        SpringApplication.run(MessageApplication.class, args);
        System.out.println("Complete " + app);
    }

}
