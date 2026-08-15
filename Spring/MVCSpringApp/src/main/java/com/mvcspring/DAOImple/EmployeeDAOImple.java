package com.mvcspring.DAOImple;

import java.util.ArrayList;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mvcspring.DAO.EmployeeDAO;
import com.mvcspring.entity.Employee;

@Component("edao")
public class EmployeeDAOImple implements EmployeeDAO {
	
	private Session session ;
	@Autowired
	public EmployeeDAOImple( Session session) {
		this.session = session;
	}
	@Override
	public void insert(Employee e) {
		
		session.beginTransaction();
		session.persist(e);
		session.getTransaction().commit();
		
	}
	
	public ArrayList<Employee> fetchAll(){
		@SuppressWarnings({ "unchecked", "deprecation" })
		ArrayList<Employee> EmployeeList = 
				(ArrayList<Employee>) session.createQuery("from Employee").list();
		
		return EmployeeList;
	}
	public Employee fetchById(int id) {
		Employee e = session.get(Employee.class,id);
		return e;
	}
}
