package com.mindgate.controller;
import java.io.PrintWriter;
import java.util.Set;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;


@WebServlet("/GetAllEmployeeServlet")
public class GetAllEmployeeServlet extends HttpServlet {
	private PrintWriter out;
	private EmployeeDAO employeeDAO = new EmployeeDAO();
	private static final long serialVersionUID = 1L;
       
 
    public GetAllEmployeeServlet() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		out=response.getWriter();
		out.print("Get All Employees");
		Set<Employee> allEmployees = employeeDAO.getAllEmployee();
		HttpSession session = request.getSession();
		session.setAttribute ("data", allEmployees);
		response.sendRedirect("displayallemployee.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
