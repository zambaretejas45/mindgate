package com.mindgate.controller;
import java.io.PrintWriter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;



@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private PrintWriter out;
	private String name;
	private double salary;
	private static final long serialVersionUID = 1L;
	private EmployeeDAO employeeDAO = new EmployeeDAO ();  
	private boolean result;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out = response.getWriter();
		name =request.getParameter("txtname");
		salary= Double.parseDouble(request.getParameter("txtsalary "));
		
		out.println("name::"+name);
		
		out.println("salary::"+salary);
		
		Employee employee = new Employee (0, name, salary) ;
		result =employeeDAO.addEmployee(employee);
		
		if(result) {
		//out.print("Record added successfully");
		//out.print("<a href=employeehome.html>Home Page</a>");
		//out.print("<a href=\"GetAllEmployeeServlet\">Get All Employees</a>");
		response.sendRedirect("GetAllEmployeeServlet");
	}
	else {
		out.print("failed to add");
		//out.print("<a href=employeehome.html>Home Page</a>");
		//out.print("<a href=\"GetAllEmployeeServlet\">Get All Employees</a>");
	}
		

	
	}

}
