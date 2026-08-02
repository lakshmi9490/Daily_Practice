package com.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.web.DAOImple.UserDAOImple;
import com.web.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	private PrintWriter pw;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		pw = resp.getWriter();
		pw.println("Hello");
		
		String name = req.getParameter("uname");
		String email = req.getParameter("uemail");
		String password = req.getParameter("password");
		String cpassword = req.getParameter("cpassword");
		
		if(password.equals(cpassword)) {
			User u = new User (name,email,password);
			UserDAOImple udim = new UserDAOImple();
			
			udim.register(u);
			resp.sendRedirect("/success.html");
			
		}else{
			resp.sendRedirect("/failure.html");
		}
		
	}
}
