package com.mindgate.controller;
import java.io.PrintWriter ;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private String loginId;
	private String password;
	private PrintWriter out;
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out= response.getWriter();
		loginId =request.getParameter("txtloginId");
		password =request.getParameter("txtpassword");
		
		if(loginId.equals(password)) {
			//response.sendRedirect("sucess.jsp");
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("sucess.jsp");
		requestDispatcher.forward(request,  response);
		
		}
		else {
			//response.sendRedirect("failure.jsp");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("failure.jsp");
			requestDispatcher.forward(request,  response);
		}
	}

}
