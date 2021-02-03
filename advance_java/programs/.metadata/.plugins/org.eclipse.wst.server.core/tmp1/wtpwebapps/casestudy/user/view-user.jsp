<%@page import="com.cybage.model.User"%>
<%@page import="java.util.List"%>
<%@include file="header.jsp"%>

<a href="<%=request.getContextPath() %>/user/add-user.jsp">Add User</a>
<br>
<table border="1">
	<tr>
		<td>User id</td>
		<td>Username</td>
		<td>Address</td>
		<td><a href="#">Update</a></td>
		<td><a href="#">Delete</a></td>
	</tr>
	<%
		List<User> users = (List)request.getAttribute("users");
		for(User u:users){
			out.print("<tr>");
			out.print("<td>"+ u.getId() +"</td>");
			out.print("<td>"+ u.getName() +"</td>");
			out.print("<td>"+ u.getAddress() +"</td>");
			out.print("<td><a href=#>Update</a></td>");
			out.print("<td><a href=#>Delete</a></td>");
			out.print("<tr>");
		}
	%>
	
</table>


<%@include file="footer.jsp"%>