package com.hib.curd.main;

import com.hib.curd.entity.Employee;
import com.hib.curd.manager.HibernateManager;

public class HibernateMain {

	public static void main(String[] args) {
		
		HibernateManager hm = new HibernateManager();
		hm.connect();
		
//		Employee e = new Employee(15,"Pranathi","HR","45000");
//		
//		hm.add(e);
		
//		hm.fetchAll();
		
//		hm.fetchOnId();
		
//		hm.updatedData(1, "Mani");
		
		hm.delete(35);
	}

}
