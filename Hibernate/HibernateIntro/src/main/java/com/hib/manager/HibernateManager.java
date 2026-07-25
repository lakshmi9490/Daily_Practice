package com.hib.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.entity.Employee;

public class HibernateManager {
	private static Configuration config;
	private static Configuration config1;
	private static SessionFactory sf;
	private static Session session;
	private Transaction t;

	public void connect(){

		session = new Configuration().configure().buildSessionFactory().openSession();

	}
	
	public void add(Employee e) {
		t = session.beginTransaction();
		session.persist(e);
		t.commit();
	}
}
