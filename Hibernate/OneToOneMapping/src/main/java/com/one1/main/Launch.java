package com.one1.main;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.one1.entity.StudentDetails;
import com.one1.entity.Students;

public class Launch {
	private static Session session;
	public static void main(String[] args) {
		session = new Configuration().configure("nani.xml")
				.addAnnotatedClass(Students.class)
				.addAnnotatedClass(StudentDetails.class)
				.buildSessionFactory().
				openSession();
		
//		Students s = new Students ("sunny","sunny@gmail.com","634523");
//		
//		StudentDetails sd = new StudentDetails("Gandhi Road","Nellore","527517");
//		
//		sd.setStudent(s);
//		
//		session.beginTransaction();
//		session.persist(sd);
//		session.getTransaction().commit();
		
		StudentDetails sd = session.get(StudentDetails.class, 2);
		System.out.println(sd.getStudent().getsName());
		
		Students s = session.get(Students.class,2 );
//		Students s = session.get(Students.class, 1);
//		if(s!=null) {
//			s.getStudentDetails().setPincode("570064");
//			session.beginTransaction();
//			session.persist(s);
//			session.getTransaction().commit();
//		}else {
//			System.out.println("No record found");
//		}
//		
//		System.out.println(s+" "+s.getStudentDetails());
		
//		Students s = new Students ("Rahul","rahul@gmail.com","456789");
//		StudentDetails sd = new StudentDetails("BTM","Bengaluru","570068");
//		
//		s.setStudentDetails(sd);
		
//		session.beginTransaction();
//		session.persist(s);
//		System.out.println("Data Added");
//		session.getTransaction().commit();
				 

	}

}
