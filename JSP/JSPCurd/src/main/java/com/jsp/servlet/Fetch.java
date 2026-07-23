 package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jsp.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Fetch extends HttpServlet {
	private String fetch = "select * from employee";
	
	private PrintWriter  pw;
	private Connection con;

	private PreparedStatement pstmt;

	private ResultSet res;

	private HttpSession session;
	
	@Override
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			pstmt = con.prepareStatement(fetch);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  pw = 	resp.getWriter();
	  ArrayList<Employee> employeeList = new ArrayList<Employee> ();
		try {
			res = pstmt.executeQuery();
			
			while(res.next()) {
				employeeList.add( new Employee(res.getInt("emp_id"),res.getString("name"),
						     res.getString("design"),res.getString("salary")));
			}
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		session = req.getSession();
	  	
		session.setAttribute("employeeList", employeeList);
		
		resp.sendRedirect("display.jsp");
	}
}
