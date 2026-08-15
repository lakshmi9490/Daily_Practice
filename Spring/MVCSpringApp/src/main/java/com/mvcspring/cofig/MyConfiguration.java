package com.mvcspring.cofig;

import org.hibernate.Session;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mvcspring.entity.Employee;


@Configuration 

@ComponentScan(basePackages = "com.mvcspring.entity ,com.mvcspring.DAOImple,"
								+ "com.mvcspring.manager") 
public class MyConfiguration {

	   @Bean("session")
	    public Session getSession() {

	        org.hibernate.cfg.Configuration configuration =
	                new org.hibernate.cfg.Configuration();

	        Session session = configuration.configure()
	        					 .addAnnotatedClass(Employee.class)
	        					.buildSessionFactory()
	        					.openSession();

	        return session;
	    }
}