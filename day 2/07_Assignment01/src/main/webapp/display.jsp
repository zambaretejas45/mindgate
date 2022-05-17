<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = session.getAttribute("username").toString();
	String address = request.getParameter("txtAddress");
	%>

 <h3> Hi <%= name %></h3>
<br>
<h3> Location <%= address %></h3>
</body>
</html>