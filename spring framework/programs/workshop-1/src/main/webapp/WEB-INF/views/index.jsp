<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>product</h2>
		
		<h3>
			<a href="<%= request.getContextPath() %>/addProduct">New product</a>
		</h3>
		<table border="1" cellpadding="5">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Price</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${listprod}" var="product">
				<tr>
					<td>${product.id}</td>
					<td>${product.name}</td>
					<td>${product.price}</td>
					<td><a href="/edit?id=${product.id}">Edit</a>
						&nbsp;&nbsp;&nbsp; <a href="/delete?id=${product.id}">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>