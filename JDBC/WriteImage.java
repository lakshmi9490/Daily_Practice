package com.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class WriteImage {
	private static String url = "jdbc:mysql://localhost:3306/demo";
	private static String userName = "root";
	private static String password = "root";
	private static Connection con;
	private static FileInputStream file;
	private static PreparedStatement pstmt;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,userName,password);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String q = "update employee set image = ? where user_id = ?";
		
		try {
			pstmt = con.prepareStatement(q);
			
			file = new FileInputStream("D:\\pictures\\books.avif");
			
			pstmt.setBinaryStream(1, file);
			
			pstmt.setInt(2,new Scanner(System.in).nextInt());
			
			int x = pstmt.executeUpdate();
			
			System.out.println(x + " rows updated");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
