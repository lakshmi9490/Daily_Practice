package com.annotation.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation.classes.JavaTrainer;
import com.annotation.classes.SQLTrainer;
import com.annotation.classes.WebTrainer;
import com.annotation.interfaces.Trainer;

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
