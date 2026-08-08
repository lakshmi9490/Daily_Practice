package com.springhiber.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springhiber.DAOImple.UserDAOImple;
import com.springhiber.config.ClassConfig;
import com.springhiber.entity.User;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext apx = new AnnotationConfigApplicationContext(ClassConfig.class) ;
		User u = 	(User) apx.getBean("user");
			System.out.println(u);
			
		UserDAOImple udao = (UserDAOImple) apx.getBean("userDAOImple");
		
		udao.insertData(u);
	}
}
