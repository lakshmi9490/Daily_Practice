package com.ioc.classes;

import com.ioc.interfaces.Time;

public class SQLPracticeTime implements Time {
	String time;
	public SQLPracticeTime(String time) {
		this.time = time;
	}	
	public String getTime() {
		return time;
	}
}
