package com.annotation.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.annotation.interfaces.Trainer;
import com.annotation.time.WebPracticeTime;

@Component("wt")
public class WebTrainer implements Trainer{
	private String name ;
	private String message;
	@Autowired
	@Qualifier("webPracticeTime")
	private WebPracticeTime wpt;
	
	
	public WebTrainer() {
		
	}
	public WebTrainer(String name,String message) {
		this.name = name;
		this.message = message;
	}
	public String getName() {
		return name;
	}
	@Autowired
	public void setName(@Value("Harish")String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	@Autowired
	public void setMessage(@Value("says create web application")String message) {
		this.message = message;
	}
	@Override
	public void giveTask() {
		System.out.println(name+ " "+message+" "+wpt.getTime());
		
	}
}
