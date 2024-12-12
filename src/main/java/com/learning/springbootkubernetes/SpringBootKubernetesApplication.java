package com.learning.springbootkubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootKubernetesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootKubernetesApplication.class, args);
    }

    @GetMapping
    public String get() {
        return "Hello world!";
    }

}
