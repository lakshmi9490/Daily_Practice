package com.jee;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
   @Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    HttpSession session = req.getSession();
	PrintWriter pw = resp.getWriter();
	pw.println(session.getAttribute("userId")
			+" "+session.getAttribute("userName")
			+" "+session.getAttribute("email")
			+" "+session.getAttribute("pwd")
			+" "+session.getAttribute("address"));
	pw.println("Hello");
}
       


}
