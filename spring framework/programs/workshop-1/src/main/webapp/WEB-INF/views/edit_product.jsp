<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Add product</h3>
	<form:form method="POST" action="/submit-form"
		modelAttribute="prod">
		<table>
		<tr>
				<td><form:input path="id" type="hidden" /></td>
			</tr>
			<tr>
				<td><form:label path="name">Product Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="price">Product Price</form:label></td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>