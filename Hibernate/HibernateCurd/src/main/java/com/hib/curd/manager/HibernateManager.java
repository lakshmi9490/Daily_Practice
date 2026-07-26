package com.hib.curd.manager;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.hib.curd.entity.Employee;

public class HibernateManager {
	private Session session;

	public void connect() {
		session = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory().openSession();
		System.out.println(session);
	}
	
	public void add(Employee e) {
		session.beginTransaction();
		session.persist(e);
		session.getTransaction().commit();
	}
	
	public void fetchAll() {
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList = (ArrayList<Employee>) session.createQuery("from Employee").list();
		
		
		for(Employee e :employeeList) {
			System.out.println(e);
		}
		
	}
	public void fetchOnId(int id) {
		
		
		Employee e = session.get(Employee.class,id);
		
		if(e != null) {
			System.out.println(e);
		}else {
			System.out.println("No Employee found");
		}
	}
	
	public void updatedData(int id,String name) {
		Employee e = session.get(Employee.class,id);
		
		if(e!=null) {
			session.beginTransaction();
			e.setName(name);
			session.persist(e);
			session.getTransaction().commit();
		}else {
			System.out.println("No Employee found with "+id);
		}
	}
	
	public void delete(int id) {
		
		Employee e = session.get(Employee.class, id);
		if(e!=null) {
			session.beginTransaction();
			session.delete(e);
			session.getTransaction().commit();
		}else {
			System.out.println("To delete Employee is not available");
		}
	}
		
}
