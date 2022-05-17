package com.mindgate.controller;
import java.io.PrintWriter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AcceptDetailsServlet")
public class AcceptDetailsServlet extends HttpServlet {
	private PrintWriter out;
	private double number1;
	private double number2;
	private double result;
	private static final long serialVersionUID = 1L;
       
  
  

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	number1 = double.valueOf(request.getParameter("txtnum1"));
	number2 = double.parsedouble(request.getParameter("txtnum2"));
	result= number1 + number 2;
	out = response.getWriter();
	out.println("addition of" + number 1+"and"+ number 2+ "is" +result);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//doGet(request, response);
	}

}
