package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData {
	static String url = "jdbc:mysql://localhost:3306/bank";
	static String userName = "root";
	static String password = "root";
	
	static Connection con;
	static PreparedStatement pstmt;
	static Scanner sc;
	
	static String q = "delete from user where id = ?";
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, userName, password);
			pstmt = con.prepareStatement(q);
			sc = new Scanner(System.in);
			pstmt.setInt(1, sc.nextInt());
			int x = pstmt.executeUpdate();
			if(x == 1) {
				System.out.println("Data is deleted");
			}else {
				System.out.println("Data is not deleted");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
