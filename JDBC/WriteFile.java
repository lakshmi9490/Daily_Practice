package com.jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class WriteFile {
	private static String url = "jdbc:mysql://localhost:3306/demo";
	private static String userName = "root";
	private static String password = "root";
	private static Connection con;
	private static PreparedStatement pstmt;
	private static BufferedReader file;
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
		String q = "update employee set file = ? where user_id = ?";
		try {
			pstmt = con.prepareStatement(q);
			System.out.println("Enter the id:");
			pstmt.setInt(2, new Scanner(System.in).nextInt());
			
			file= new BufferedReader(new FileReader("D:\\file\\hello.txt"));
			pstmt.setCharacterStream(1, file);
			
			int x = pstmt.executeUpdate();
			System.out.println(x+ " rows updated");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
