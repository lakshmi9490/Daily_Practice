package com.ioc.classes;

import com.ioc.interfaces.Trainer;

public class WebTrainer implements Trainer{
	private String name ;
	private String message ;
	private WebPracticeTime wpt;	
	
	public WebPracticeTime getWpt() {
		return wpt;
	}

	public void setWpt(WebPracticeTime wpt) {
		this.wpt = wpt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void giveTask() {
		System.out.println(name+ " "+message+" "+wpt.getTime());
		
	}

}
