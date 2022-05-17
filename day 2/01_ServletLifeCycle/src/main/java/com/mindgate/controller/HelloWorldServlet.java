package com.mindgate.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public HelloWorldServlet() {
        super();
        System.out.println("HelloWorldServlet Object Created");
       
    }


	public void init(ServletConfig config) throws ServletException {
        System.out.println("init() called");
		
	}

	
	public void destroy() {
		   System.out.println("destroy() called");
		
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   System.out.println("service() called");
	}

}
