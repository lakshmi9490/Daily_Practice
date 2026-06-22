package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Transactions {
	static String url = "jdbc:mysql://localhost:3306/bank";
	static String userName = "root";
	static String password = "root";
	
	static Connection con ;
	static Statement stmt;
	static PreparedStatement pstmt;
	static ResultSet res;
	static Scanner sc = new Scanner(System.in);
	
	static String q = "select * from user";
	static String senderQuery = "update `user` set `balance` = `balance` - ? where `acctno` = ?";
	static String reciverQuery = "update user set balance = balance + ? where acctno = ?";
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,userName,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		disp();
		try {
			con.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter the sender acctno :");
		String s_acctno = sc.nextLine();
		System.out.println("Enter the amount :");
		int amount = sc.nextInt();
		sc.nextLine();
		
		try {
			pstmt = con.prepareStatement(senderQuery);
			pstmt.setInt(1,amount);
			pstmt.setString(2, s_acctno);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		System.out.println("Enter the reciver acctno :");
		String r_acctno = sc.nextLine();
		try {
			pstmt = con.prepareStatement(reciverQuery);
			pstmt.setInt(1, amount);
			pstmt.setString(2, r_acctno);
			
			pstmt.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		Authenticate.verify(sc, con);
	
		disp();
	}
	public static void disp() {
		try {
			stmt = con.createStatement();
			res = stmt.executeQuery(q);
			while(res.next()) {
				System.out.println(res.getInt(1)+" "+res.getString(2)+" "+
								   res.getString(3)+" "+res.getInt(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
