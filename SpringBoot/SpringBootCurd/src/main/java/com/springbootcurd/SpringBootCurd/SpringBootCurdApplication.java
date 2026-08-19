package com.springbootcurd.SpringBootCurd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springbootcurd.controller", "com.springbootcurd.services"})
@EnableJpaRepositories(basePackages = "com.springbootcurd.repo")
@EntityScan(basePackages = "com.springbootcurd.entity")
public class SpringBootCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCurdApplication.class, args);
		System.out.println("Started");
	}

}
