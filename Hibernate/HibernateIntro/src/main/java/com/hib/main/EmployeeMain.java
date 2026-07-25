package com.hib.main;

import com.hib.entity.Employee;
import com.hib.manager.HibernateManager;

public class EmployeeMain {

	public static void main(String[] args) {
		HibernateManager hm = new HibernateManager();
		hm.connect();
		
	    Employee e = new Employee(12,"manu","HR","56000");
	    
	    hm.add(e);
	}

}
