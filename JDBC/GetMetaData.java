package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class GetMetaData {
	static Connection con ;
	static Statement stmt;
	static ResultSet res;
	static ResultSetMetaData rsmd;
	static String q = "select * from user";
	public static void main(String[] args) {
		try {
			con = MyConnection.connect(con);
			stmt = con.createStatement();
		    res = stmt.executeQuery(q);
		    rsmd = res.getMetaData();
		    int count = rsmd.getColumnCount();
		    for(int i=1;i<=count;i++) {
		    		System.out.println(rsmd.getColumnName(i)+ "    "+rsmd.getColumnTypeName(i));
		    }
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
