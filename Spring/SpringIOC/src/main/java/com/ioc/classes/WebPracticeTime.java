package com.ioc.classes;

import com.ioc.interfaces.Time;

public class WebPracticeTime implements Time{
	String time;
	public WebPracticeTime(String time) {
		this.time = time;
	}
	public String getTime() {
		return time;
	}
}
