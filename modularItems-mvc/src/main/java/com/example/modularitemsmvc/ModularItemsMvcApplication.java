package com.example.modularitemsmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.modularitemsmvc",
        "com.example.modularitems.common"})
@EnableJpaRepositories("com.example.modularitems.common")
@EntityScan("com.example.modularitems.common")
public class ModularItemsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModularItemsMvcApplication.class, args);
    }

}
