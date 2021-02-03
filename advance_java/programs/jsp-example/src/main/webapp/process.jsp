<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!//code inside decalaration tag goes outside _jspService()
	public int add() {
		return 10 + 20;
	}%>

	<%
		String name = request.getParameter("username");
		System.out.println(name + add());
		//out.print("username is:" + name);
		System.out.println(10/0);
	%>
	<%="username is:" + name%>

	<%
		//response.sendRedirect("http://www.google.com");
	%>
</body>
</html>