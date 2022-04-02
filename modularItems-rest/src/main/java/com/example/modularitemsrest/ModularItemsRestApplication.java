package com.example.modularitemsrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.modularitemsrest",
        "com.example.modularitems.common"})
@EnableJpaRepositories("com.example.modularitems.common")
@EntityScan("com.example.modularitems.common")
public class ModularItemsRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModularItemsRestApplication.class, args);
    }

}
