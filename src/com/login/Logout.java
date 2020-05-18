package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


/**
 * Servlet implementation class Logout
 */
@SuppressWarnings("serial")
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("username");
		session.invalidate();
		response.sendRedirect("login.jsp");

	}

	

}
