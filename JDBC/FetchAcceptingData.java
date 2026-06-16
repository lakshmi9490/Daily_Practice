package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class FetchAcceptingData {
	static String url = "jdbc:mysql://localhost:3306/bank";
	static String userName = "root";
	static String password = "root";
	static Connection con ;
	static PreparedStatement pstmt;
	static ResultSet res;
	static String q = "select * from user where id = ?";
	static Scanner sc ;
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,userName,password);
			pstmt = con.prepareStatement(q);
			sc = new Scanner(System.in);
			int id = sc.nextInt();
			pstmt.setInt(1, id);
			res = pstmt.executeQuery();
			if(res.next()) {
				System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getInt(4));
			}else {
				System.out.println("No record found");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
