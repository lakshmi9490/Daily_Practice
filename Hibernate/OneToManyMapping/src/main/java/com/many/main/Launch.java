package com.many.main;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.many.entity.TeamLeader;
import com.many.entity.TeamMember;

public class Launch {
	private static Session session;
	
	public static void main(String[] args) {
		
		session = new Configuration().configure().addAnnotatedClass(TeamMember.class)
				.addAnnotatedClass(TeamLeader.class).buildSessionFactory().openSession();
		
		TeamMember tm1 = session.get(TeamMember.class,1);
		
		System.out.println(tm1+" "+tm1.getTeamLeader());
//		TeamLeader tl = session.get(TeamLeader.class, 1);
//		
//		System.out.println(tl+" "+tl.getTeamMembers());
		
//		TeamLeader t1 = new TeamLeader("Praveen");
//		TeamLeader t2 = new TeamLeader("Raju");
//		
//		
//		TeamMember tm1=  new TeamMember("Soniya","Dev"); 
//		TeamMember tm2=  new TeamMember("Mani","Dev"); 
//		TeamMember tm3=  new TeamMember("Lokesh","Dev"); 
//		TeamMember tm4=  new TeamMember("Rohini","Dev"); 
//		TeamMember tm5=  new TeamMember("Anitha","Dev"); 
//		TeamMember tm6=  new TeamMember("Karthik","Dev"); 
//		
//		t1.addMember(tm1);
//		t1.addMember(tm3);
//		t1.addMember(tm5);
//		
//		t2.addMember(tm2);
//		t2.addMember(tm4);
//		t2.addMember(tm6);
//		
//		session.beginTransaction();
//		session.persist(t1);
//		session.persist(t2);
//		session.getTransaction().commit();
		
	}

}
