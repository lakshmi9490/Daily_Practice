package com.springboot.SpringBootIntro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@ComponentScan(basePackages = {"com.springboot.controller", "com.springboot.services"})
@EnableJpaRepositories(basePackages = "com.springboot.repo")
@EntityScan(basePackages = "com.springboot.entity")
public class SpringBootIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIntroApplication.class, args);
		System.out.println("Started");
		
	}

}
