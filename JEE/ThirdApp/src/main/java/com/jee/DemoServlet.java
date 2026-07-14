package com.jee;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class DemoServlet extends HttpServlet {

	private PrintWriter pw;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		pw = resp.getWriter();
		pw.println(name);
		
		req.getRequestDispatcher("TestServlet").include(req, resp);
	}

}
