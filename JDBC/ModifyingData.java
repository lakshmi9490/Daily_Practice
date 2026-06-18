package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ModifyingData {
	
	static String url = "jdbc:mysql://localhost:3306/bank";
	static String userName = "root";
	static String password = "root";
	
	static Connection con ;
	static PreparedStatement pstmt;
	static Scanner sc;
	
	static String q = "update user set balance = ? where acctno = ?";
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, userName, password);
			pstmt = con.prepareStatement(q);
			sc = new Scanner(System.in);
			
			int bal = sc.nextInt();
			sc.nextLine();
			String acctno = sc.nextLine();
			
			pstmt.setInt(1,bal);
			pstmt.setString(2, acctno);
			
			int x = pstmt.executeUpdate();
			
			if(x==1) {
				System.out.println("Data is Modified");
			}else {
				System.out.println("Data is not Modified");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
