package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertAcceptingData {
	static String url = "jdbc:mysql://localhost:3306/bank";
	static String userName = "root";
	static String password = "root";
	static Connection con;
	static PreparedStatement pstmt;
	static Scanner sc ;
	static String q = "insert into user(acctno,name,balance) values(?,?,?)";
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,userName,password);
			pstmt = con.prepareStatement(q);
			sc = new Scanner(System.in);
			String data = sc.nextLine();
			String arr[] = data.split(",");
			pstmt.setInt(1, Integer.parseInt(arr[0]));
			pstmt.setString(2,arr[1]);
			pstmt.setString(3, arr[2]);
			
			int x = pstmt.executeUpdate();
			if(x==1) {
				System.out.println("Data is inserted");
			}else {
				System.out.println("Data is not inserted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
