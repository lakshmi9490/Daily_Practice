package com.config.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class PlatinumCustomer {
	@Autowired
	@Value("Rani")
	private String name;
	@Autowired
	@Value("PlatinumCustomer")
	private String type;
	
	
	@Override
	public String toString() {
		return "PlatinumCustomer [name=" + name + ", type=" + type + "]";
	}
}
