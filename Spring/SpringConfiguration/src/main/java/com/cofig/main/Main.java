package com.cofig.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.confclass.MyConfig;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext apx = new AnnotationConfigApplicationContext(MyConfig.class);
		System.out.println(apx.getBean("goldCustomer"));
		System.out.println(apx.getBean("platinumCustomer"));
	}
}
