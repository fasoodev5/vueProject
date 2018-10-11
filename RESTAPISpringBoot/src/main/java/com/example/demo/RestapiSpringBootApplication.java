package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.fasoo.vuejs", "com.fasoo.vuejs.controller"})
@EntityScan("com.fasoo.vuejs.model")
@EnableJpaRepositories("com.fasoo.vuejs.repository")
public class RestapiSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiSpringBootApplication.class, args);
	}
}
