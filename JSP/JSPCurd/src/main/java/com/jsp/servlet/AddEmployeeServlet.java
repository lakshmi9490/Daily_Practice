package com.jsp.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddEmployeeServlet extends HttpServlet {
	private String insert = "insert into employee(emp_id,name,design,salary) values(?,?,?,?)";
	private Connection con;
	private PreparedStatement pstmt;
	@Override
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			pstmt = con.prepareStatement(insert);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int empId = Integer.parseInt(req.getParameter("empId"));
		String name = req.getParameter("name");
		String design = req.getParameter("design");
		int salary = Integer.parseInt(req.getParameter("salary"));
		
		try {
			pstmt.setInt(1, empId);
			pstmt.setString(2, name);
			pstmt.setString(3, design);
			pstmt.setInt(4, salary);
			
			int x = pstmt.executeUpdate();
			if(x==0) {
				resp.sendRedirect("failure.jsp");
			}else {
				resp.sendRedirect("Fetch");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
