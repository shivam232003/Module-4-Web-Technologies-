<%@page import="dao.UserDao"%>
<%@page import="model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String msg = (String) request.getAttribute("msg");
	%>

	<%
	if (msg != null) {
		out.print(msg);
	}
	%>

	<%
	List<User> list = UserDao.showUser();
	%>


	<table border="1">
		<tr>
			<th>First_name</th>
			<th>Last_name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Password</th>
		</tr>

		<%
			for (User u : list) {
		%>
		<tr>
			<td><%=u.getFname()%></td>
			<td><%=u.getLname()%></td>
			<td><%=u.getEmail()%></td>
			<td><%=u.getMobile()%></td>
			<td><%=u.getPassword()%></td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>