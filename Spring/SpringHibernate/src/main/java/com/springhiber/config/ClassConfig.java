package com.springhiber.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springhiber.entity,com.springhiber.DAOImple")
public class ClassConfig {

}
