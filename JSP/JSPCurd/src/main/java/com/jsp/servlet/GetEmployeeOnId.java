package com.jsp.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/GetEmployeeOnId")
public class GetEmployeeOnId extends HttpServlet{
	private String fetch_on_id = "select * from employee where emp_id=?";
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet res;
	private HttpSession session;

	@Override
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
        		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
        		pstmt = con.prepareStatement(fetch_on_id);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("empId"));
		session = req.getSession();
		try {
			pstmt.setInt(1, id);
			
			res = pstmt.executeQuery();
			
			if(res.next()) {
				session.setAttribute("empId", id);
				session.setAttribute("name", res.getString("name"));
				session.setAttribute("design",res.getString("design"));
				session.setAttribute("salary",res.getString("salary"));
			}
			resp.sendRedirect("editEmployee.jsp");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}
}
