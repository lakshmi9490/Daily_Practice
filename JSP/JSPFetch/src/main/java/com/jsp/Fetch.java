package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jsp.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



public class Fetch extends HttpServlet {
	
	private String fetch = "select * from employee"; 
	
	private PrintWriter pw;
	private Connection con;
	

	private ResultSet res;

	private Statement stmt;
	
	ArrayList<Employee> employeeList = new ArrayList<Employee> ();

	private HttpSession session;
	@Override
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			stmt = con.createStatement();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		session = req.getSession();
		pw = resp.getWriter();
	    try {
			res = stmt.executeQuery(fetch);
			while(res.next()) {
				employeeList.add(new Employee(res.getInt("emp_id"),res.getString("name")
						,res.getString("design"),res.getInt("salary")));
			}
			session.setAttribute("employeeList", employeeList);
			resp.sendRedirect("display.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
			
		} 
		
//		pw.println("<html><body><center>");
//		pw.println("<table border='1' cellpadding='8' cellspacing='0'>");
//		pw.println("<tr>");
//		pw.println("<th>Emp_Id</th><th>Name</th><th>Design</th><th>Salary</th>");
//		pw.println("</tr>");
//
//		try {
//		    res = stmt.executeQuery(fetch); 
//		    while(res.next()) {
//		        pw.println("<tr>");
//		        pw.println("<td>" + res.getInt("emp_id") + "</td>");
//		        pw.println("<td>" + res.getString("name") + "</td>");
//		        pw.println("<td>" + res.getString("design") + "</td>");
//		        pw.println("<td>" + res.getInt("salary") + "</td>");
//		        pw.println("</tr>");
//		    }
//		} catch(Exception e) {
//		    e.printStackTrace();
//		}
//
//		pw.println("</table>");
//		pw.println("</center></body></html>");
		
	}


}
