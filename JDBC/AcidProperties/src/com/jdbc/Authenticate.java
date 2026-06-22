package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Authenticate {
	private static int upin = 151202;
	public static void verify(Scanner sc,Connection con) {
		System.out.println("Do you really want do the transaction?\nEnter the pin");
		int pin = sc.nextInt();
		if(upin == pin) {
			try {
				con.commit();
				System.out.println("Commited");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			try {
				con.rollback();
				System.out.println("Roll Back");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
}
