package com.annotation.time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("jpt")
public class JavaPracticeTime {
	String time ;
	
	public String getTime() {
		return time;
	}

	@Autowired
	public JavaPracticeTime(@Value("2 hours") String time) {
		this.time = time;
	}
}
