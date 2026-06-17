package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

public class InsertingData {
	static String url = "jdbc:mysql://localhost:3306/bank";
	static String userName = "root";
	static String password = "root";
	static Connection con;
	static Statement stmt;

	static String q = "insert into user(acctno,name,balance) values('1516','Raju',51000)";
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,userName,password);
			stmt = con.createStatement();
			 stmt.executeUpdate(q);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
