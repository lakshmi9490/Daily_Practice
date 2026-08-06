package com.ioc.classes;

import com.ioc.interfaces.Trainer;

public class SQLTrainer implements Trainer{
	private String name ;
	private String message ;
	private SQLPracticeTime spt;
	
	public SQLPracticeTime getSpt() {
		return spt;
	}

	public void setSpt(SQLPracticeTime spt) {
		this.spt = spt;
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
		System.out.println(name+ " "+message+spt.getTime());
		
	}

}
