package com.springhiber.DAOImple;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import com.springhiber.DAO.UserDAO;
import com.springhiber.entity.User;

@Component
public class UserDAOImple implements UserDAO {
	Session session;
	
	public UserDAOImple() {
		session = new Configuration().configure().addAnnotatedClass(User.class)
				.buildSessionFactory().openSession();
	}
	@Override
	public void insertData(User u) {
		session.beginTransaction();
		session.persist(u);
		session.getTransaction().commit();
	}
	
}
