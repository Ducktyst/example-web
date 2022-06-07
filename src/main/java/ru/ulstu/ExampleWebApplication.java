package ru.ulstu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class ExampleWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleWebApplication.class, args);
    }
}
