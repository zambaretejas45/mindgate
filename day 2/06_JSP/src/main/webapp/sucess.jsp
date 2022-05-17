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
	String user = request.getParameter("txtloginId");
	%>
<h1> LOGIN SUCESSFUL</h1>
<h3>
	<%
	out.println(user);
	%>
</h3>
</body>
</html>