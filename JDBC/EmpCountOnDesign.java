package com.jdbc.storedprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class EmpCountOnDesign {
	
	private static String url = "jdbc:mysql://localhost:3306/demo";
	private static String userName = "root";
	private static String password = "root";
	
	private static Connection con ;
	private static CallableStatement callableStmt;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,userName,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		String sql = "{call emp_count(?,?)}";
		Scanner sc = new Scanner (System.in);
		try {
			callableStmt = con.prepareCall(sql);
			String design = sc.nextLine();
			
			callableStmt.setString(2,design);
			
			 callableStmt.registerOutParameter(1, Types.INTEGER);
			 callableStmt.execute();
			 int count = callableStmt.getInt(1);
			 System.out.println(count);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sc.close();

	}

}
