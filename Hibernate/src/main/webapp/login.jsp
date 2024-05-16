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
	String msg = (String)request.getAttribute("msg");
%>
<%
	if(msg != null){
%>
<h1><%out.print(msg);} %></h1>
	<form action="UserServlet" method="post">
		<table>		
		     <tr>
				<td>Email:</td>
				<td><input type="email" name="email">
			</tr>
		
		    <tr>
				<td>Password:</td>
				<td><input type="password" name="password">
			</tr>
			
			<tr>
				<td><button type="submit" name="action" value="login">Login</button></td>
			</tr>
		
		</table>
	
	</form>
</body>
</html>