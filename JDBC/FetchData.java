package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class FetchData {
	static String url = "jdbc:mysql://localhost:3306/bank";
	static String userName = "root";
	static String password = "root";
	static Connection con ;
	static Statement stmt;
	static ResultSet res;
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection(url,userName,password);
			 stmt = con.createStatement();
			 res = stmt.executeQuery("Select * from user");
			 while(res.next()==true) {
				 System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getInt(4));
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
