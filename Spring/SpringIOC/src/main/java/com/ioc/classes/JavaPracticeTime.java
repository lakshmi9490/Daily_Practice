package com.ioc.classes;

import com.ioc.interfaces.Time;

public class JavaPracticeTime implements Time {
	String time;


	public JavaPracticeTime(String time) {
		this.time = time;
	}
	public String getTime() {
		return time;
	}
}
