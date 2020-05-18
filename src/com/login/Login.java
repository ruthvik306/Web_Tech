package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.db.LoginDb;

@SuppressWarnings("serial")
@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uname = request.getParameter("uname");
	String pass = request.getParameter("pass");
	
	LoginDb ld = new LoginDb();
	
	
	if(ld.check(uname, pass)) {
		HttpSession session = request.getSession();
		session.setAttribute("username", uname);
		response.sendRedirect("game.jsp");
	}
	else {
		response.sendRedirect("login.jsp");
	}


}
}
