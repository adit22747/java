<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>login form</h1>
	
	<% out.print("using out.print"); %>
	
	<%= "using expression tag" %>
	
	<c:out value="this is jstl way"></c:out>
	
	<c:forEach var="i" begin="10" end="20">
		<br> Number: <c:out value="${i}"></c:out>
	</c:forEach>

	<%-- <%
	Cookie cookie = new Cookie("address","pune");
	response.addCookie(cookie);
	%>  --%>
	<form action="authenticate.jsp" method="post">
		username: <input type="text" name="username"> password: <input
			type="password" name="password"> <input type="submit"
			name="submit" value="login">
	</form>

</body>
</html>