package com.syphan.practice.house.service.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = "com.syphan.practice.house.service.api.model")
@EnableJpaRepositories(basePackages = "com.syphan.practice.house.service.api.repository")
@EnableTransactionManagement
@EnableScheduling
@EnableAsync
public class HouseServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseServiceApplication.class, args);
    }

}
