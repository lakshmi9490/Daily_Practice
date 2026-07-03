package com.dao.main;

import com.dao.imple.UserDAOImple;
import com.dao.model.User;

public class MainClass {

	public static void main(String[] args) {
//		User u = new User("Ramesh","4563","ramesh@420","Guntur");
//		UserDAOImple udi = new UserDAOImple();
//		System.out.println(udi.insertUser(u));
		
		UserDAOImple udi = new UserDAOImple();
//		System.out.println(udi.getAllUser());
		
//		System.out.println(udi.getUserById(1));
		
		System.out.println(udi.deleteUserById(4));
	}

}
