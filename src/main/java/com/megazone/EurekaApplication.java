package com.megazone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * The type Application.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    @Value("${spring.application.name}")
    String application_name;

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
