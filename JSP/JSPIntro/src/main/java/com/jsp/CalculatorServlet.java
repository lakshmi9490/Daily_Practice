package com.jsp;

import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	
	private HttpSession session;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int x = Integer.parseInt(req.getParameter("x"));
		int y = Integer.parseInt(req.getParameter("y"));
		
		session = req.getSession();
		
		session.setAttribute("add",add(x,y));
		session.setAttribute("sub",sub(x,y));
		session.setAttribute("mul",mul(x,y));
		session.setAttribute("div",div(x,y));
		
		resp.sendRedirect("cal1.jsp");
	}
	int add(int a,int b) {
		return a+b;
	}
	int sub(int a,int b) {
		return a-b;
	}
	int mul(int a,int b) {
		return a*b;
	}
	int div(int a,int b) {
		return a/b;
	}

}
