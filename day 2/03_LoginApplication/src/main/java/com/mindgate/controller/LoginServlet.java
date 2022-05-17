package com.mindgate.controller;
import java.io.PrintWriter;

import java.io.IOException;
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
		loginId =request.getParameter("txtlogiId");
		password =request.getParameter("txtPassword");
		
		if(loginId.equals("admin") && password.equals("abcd")) {
			out.print("Welcome");
		
		}
		else {
			out.print("Invalid password");
		}
		
	}

}
