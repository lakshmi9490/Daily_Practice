package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ResetPassword")
public class ResetPasswordServlet extends HttpServlet{
	private String q = "update user set password = ? where email = ?";
	private Connection con;
	private PreparedStatement pstmt;
	@Override
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_delivery_app","root","root");
			pstmt = con.prepareStatement(q);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email  = req.getParameter("email");
		String password = req.getParameter("pwd");
		String Cpassword = req.getParameter("cpwd");
		
		if(password.equals(Cpassword)) {
			try {
				pstmt.setString(1, Cpassword);
				pstmt.setString(2, email);
				
				int x = pstmt.executeUpdate();
				
				if(x==0) {
					resp.sendRedirect("failure.html");
				}else {
					resp.sendRedirect("success.html");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			resp.sendRedirect("PasswordMisMatch");
		}

	}
}
