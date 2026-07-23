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


public class DeleteEmployeeServlet extends HttpServlet {
	private String delete = "delete from employee where emp_id = ?";
	private Connection con;
	private PreparedStatement pstmt;
@Override
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			pstmt = con.prepareStatement(delete);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			pstmt.setInt(1, Integer.parseInt(req.getParameter("empId")));
			
			int x = pstmt.executeUpdate();
			
			if(x==0){
				resp.sendRedirect("failure.jsp");
			}else {
				resp.sendRedirect("Fetch");
			}
		} catch (Exception e) {
	
			e.printStackTrace();
		} 
	}



}
