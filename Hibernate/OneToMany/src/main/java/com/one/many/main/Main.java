package com.one.many.main;



import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.one.many.entity.Course;
import com.one.many.entity.Student;
import com.one.many.entity.StudentDetails;

public class Main {
	private static Session session;
	public static void main(String[] args) {
		session = new Configuration().configure("nani.xml").
				addAnnotatedClass(Student.class).
				addAnnotatedClass(StudentDetails.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory()
				.openSession();
		
		Student s = session.get(Student.class, 1);
		System.out.println(s+" "+s.getStudentDetails()+" "+s.getCourses());
		
//		Student s = new Student("Dhoni","dhoni@gmail.com","777777");
//		StudentDetails sd = new StudentDetails("Gandhi Road","Ranchi","574632");
//		
//		s.setStudentDetails(sd);
//		sd.setStudent(s);
//		
//		Course c1 = new Course("HTML",10);
//		Course c2 = new Course("Java",45);
//		Course c3 = new Course("MySQL",30);
//		
//		s.addCourse(c1);
//		s.addCourse(c2);
//		s.addCourse(c3);
//		
//		session.beginTransaction();
//		session.persist(s);
//		session.getTransaction().commit();
		

	}

}
