package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private PrintWriter printWriter;
	private String name;
	private static final long serialVersionUID = 1L;
       
 
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		printWriter= response.getWriter();
		//printWriter.println("Hello from doGet()");
		name = request.getParameter("txtUserName");
		printWriter.println("Hello : :"+name);
			
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		printWriter= response.getWriter();
		//printWriter.println("Hello from doPost()");
		name = request.getParameter("txtUserName");
		printWriter.println("Hello : :"+name);
		
	}

}
