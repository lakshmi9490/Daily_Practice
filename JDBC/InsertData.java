package com.jdbc.storedprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class InsertData {
	
	private static Connection con;
	
	private static String url = "jdbc:mysql://localhost:3306/demo";
	private static String userName = "root";
	private static String password = "root";

	private static CallableStatement callebleStmt;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,userName,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		String sql = "{call hike_for_dept(?,?)}";
		String sql = "{call insert_employee(?,?,?,?)}";
		Scanner sc = new Scanner(System.in);
		try { 
			 callebleStmt = con.prepareCall(sql);
			 int id = sc.nextInt();
			 sc.nextLine();
			 String name = sc.nextLine();
			 String design = sc.nextLine();
			 int salary = sc.nextInt();
		 
			callebleStmt.setInt(1,id);
			callebleStmt.setString(2, name);
			callebleStmt.setString(3, design);
			callebleStmt.setInt(4, salary);
			
			
			callebleStmt.execute();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		sc.close();
	}

}
