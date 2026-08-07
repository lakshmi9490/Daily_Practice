package com.config.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GoldCustomer {
	
	@Autowired
	@Value("Pandu")
	private String name;
	@Autowired
	@Value("GoldCustomer")
	private String type;
	
	
	@Override
	public String toString() {
		return "GoldCustomer [name=" + name + ", type=" + type + "]";
	}
	
	
}
