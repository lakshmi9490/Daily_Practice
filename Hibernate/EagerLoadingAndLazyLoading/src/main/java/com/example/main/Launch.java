package com.example.main;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.example.entity.TeamLeader;
import com.example.entity.TeamMember;

public class Launch {
	private static Session session;
	public static void main(String []args) {
		

		session = new Configuration().configure().addAnnotatedClass(TeamMember.class)
					.addAnnotatedClass(TeamLeader.class).buildSessionFactory().openSession();
		TeamLeader tl = session.get(TeamLeader.class, 1);
		
		System.out.println(tl);
//		System.out.println(session);
//		
//		TeamLeader t1 = new TeamLeader("Raju");
//		TeamLeader t2 = new TeamLeader("Rani");
//		
//		TeamMember tm1= new TeamMember("Praveen","Developer");
//		TeamMember tm2= new TeamMember("Muni","Developer");
//		TeamMember tm3= new TeamMember("Rohit","Developer");
//		
//		TeamMember tm4= new TeamMember("Ganesh","Tester");
//		TeamMember tm5= new TeamMember("Ganesh","Tester");
//		TeamMember tm6= new TeamMember("Ganesh","Tester");
//		
//		t1.addmembers(tm1);
//		t1.addmembers(tm4);
//		t1.addmembers(tm3);
//		
//		t2.addmembers(tm2);
//		t2.addmembers(tm5);
//		t2.addmembers(tm6);
//		
//		session.beginTransaction();
//		session.persist(t1);
//		session.persist(t2);
//		session.getTransaction().commit();
	}

}
