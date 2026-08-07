package com.annotation.time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WebPracticeTime {
	 String time;
	 
	 public String getTime() {
			return time;
		}
	
	@Autowired
	public WebPracticeTime(@Value("1.5 hours")String time) {
		this.time = time;
	}
}
