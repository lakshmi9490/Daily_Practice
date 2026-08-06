package com.ioc.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.classes.JavaPracticeTime;
import com.ioc.classes.JavaTrainer;
import com.ioc.classes.SQLPracticeTime;
import com.ioc.classes.SQLTrainer;
import com.ioc.classes.WebPracticeTime;
import com.ioc.classes.WebTrainer;
import com.ioc.interfaces.Time;
import com.ioc.interfaces.Trainer;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("bean.xml");
		
		Trainer jt = (JavaTrainer) cpx.getBean("jt");
		Trainer st = (SQLTrainer) cpx.getBean("st");
		Trainer wt = (WebTrainer) cpx.getBean("wt");
		

		
		jt.giveTask();
		st.giveTask();
		wt.giveTask();
		
		
		
		

	}

}
