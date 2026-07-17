package com.jee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class LoginServlet
 */

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private String q = "select * from user where email = ?";
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet res;

	@Override
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/food_delivery_app","root","root");
			pstmt = con.prepareStatement(q);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		try {
			pstmt.setString(1,req.getParameter("email"));
			res = pstmt.executeQuery();
			if(res.next()) {
				String dpwd = res.getString("password");
				if(req.getParameter("pwd").equals(dpwd)) {
					
					int userId = res.getInt("user_id");
					String userName = res.getString("user_name") ;
					String email = res.getString("email");
					String pwd = res.getString("password");
					String address = res.getString("address");
					
					HttpSession session = req.getSession();
					
					session.setAttribute("userId",userId);
					session.setAttribute("userName",userName);
					session.setAttribute("email", email);
					session.setAttribute("pwd", pwd);
					session.setAttribute("address",address);
					
//					resp.sendRedirect("DisplayServlet");
					req.getRequestDispatcher("DisplayServlet").forward(req, resp);

				}
				else {
					resp.sendRedirect("inValid.html");
				}
			}else {
				resp.sendRedirect("register.html");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

}
