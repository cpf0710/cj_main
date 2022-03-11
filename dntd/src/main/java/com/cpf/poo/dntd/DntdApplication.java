package com.cpf.poo.dntd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DntdApplication {

    public static void main(String[] args) {
        SpringApplication.run(DntdApplication.class, args);
    }

}
