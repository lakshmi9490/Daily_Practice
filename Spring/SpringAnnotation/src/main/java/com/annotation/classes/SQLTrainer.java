package com.annotation.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.annotation.interfaces.Trainer;
import com.annotation.time.SQLPracticeTime;

@Component("st")
public class SQLTrainer implements Trainer{
	private String name ;
	private String message;
	private SQLPracticeTime spt;
	
	
	public SQLPracticeTime getJpt() {
		return spt;
	}
	@Autowired
	public void setJpt(@Qualifier("SQLPracticeTime") SQLPracticeTime spt) {
		this.spt = spt;
	}
	
	@Autowired
	public SQLTrainer(@Value("Blesina")String name,@Value("says practice complex queries")String message) {
		this.name = name;
		this.message = message;	
	}
	public String getName() {
		return name;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public void giveTask() {
		System.out.println(name+ " "+message+" "+spt.getTime());
		
	}
}
