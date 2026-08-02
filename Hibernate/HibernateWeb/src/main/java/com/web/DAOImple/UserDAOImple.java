package com.web.DAOImple;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.web.DAO.UserDAO;
import com.web.entity.User;

public class UserDAOImple implements UserDAO{
	private Session session;
	public UserDAOImple(){
		session = new Configuration().configure().addAnnotatedClass(User.class)
				.buildSessionFactory().openSession();
	}
	public void register(User u) {
		session.beginTransaction();
		session.persist(u);
		session.getTransaction().commit();
	}
}
