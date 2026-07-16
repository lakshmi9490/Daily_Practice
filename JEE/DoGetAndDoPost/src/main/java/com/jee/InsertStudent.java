package com.jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class InsertStudent
 */
@WebServlet("/insertStudent")
public class InsertStudent extends HttpServlet {
private Connection con;
private String q = "insert into user(user_id,user_name,user_emailId,user_mobile) values(?,?,?,?)";
private PreparedStatement pstmt;
int x;
@Override
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			pstmt = con.prepareStatement(q);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int userId = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String emailId = req.getParameter("emailId");
		String mobile = req.getParameter("mobile");
		
		try {
			pstmt.setInt(1, userId);
			pstmt.setString(2, name);
			pstmt.setString(3, emailId);
			pstmt.setString(4, mobile);
			 x = pstmt.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(x==0) {
			resp.sendRedirect("failure.html");
		}else {
			resp.sendRedirect("success.html");
		}
	}

}
