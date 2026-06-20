package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BatchData {
	static String url = "jdbc:mysql://localhost:3306/bank";
	static String userName = "root";
	static String password = "root";
	
	static Connection con;
	static PreparedStatement pstmt;
	
	static String q = "insert into user(id,acctno,name,balance)  values(?,?,?,?)";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,userName,password);
	       	System.out.println("Enter the number of user do you want to insert:");
	       	int n = sc.nextInt();
	       	pstmt = con.prepareStatement(q);
	       	for(int i=0;i<n;i++) {
	       		
	       		System.out.println("Enter the id :");
	       		pstmt.setInt(1, sc.nextInt());
	       		sc.nextLine();
	       		System.out.println("Enter the acctno :");
	       		pstmt.setString(2, sc.nextLine());
	       		System.out.println("Enter the name :");
	       		pstmt.setString(3, sc.nextLine());;
	       		System.out.println("Enter the balance :");
	       		pstmt.setInt(4, sc.nextInt());
	       		
	       		pstmt.addBatch();
	       	}
	       	pstmt.executeBatch();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
