<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page two</title>
</head>

<body>
	<%
	String name = request.getParameter("txtName");
	session.setAttribute("username", name);
	%>
	<h2>Page Two</h2>

	<form action="display.jsp" method="post">
		Address <input type="text" name="txtAddress"><br> <br>
		<br> <input type="submit" value="OK">


	</form>
</body>
</html>