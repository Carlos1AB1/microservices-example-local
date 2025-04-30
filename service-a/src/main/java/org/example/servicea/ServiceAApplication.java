package org.example.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient; // O @EnableEurekaClient

@SpringBootApplication
@EnableDiscoveryClient // Habilita el registro en Eureka (o cualquier otro Discovery Service)
public class ServiceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAApplication.class, args);
    }

}