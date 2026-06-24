package com.jdbc.storedprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class SalaryHike {
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
		
		Scanner sc = new Scanner(System.in);
		try {
			String sql = "{call hike_for_dept(?,?)}";
			callebleStmt = con.prepareCall(sql);
			System.out.println("Enter the department to hike:");
			String dept = sc.nextLine();
			System.out.println("Enter the hike");
			int hike = sc.nextInt();
			
			callebleStmt.setString(2,dept);
			callebleStmt.setInt(1, hike);
			
			callebleStmt.execute();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		sc.close();

	}

}
