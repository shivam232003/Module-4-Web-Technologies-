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
		if(msg != null){
			out.println(msg);
		}
	%>
	<%
		String msg1 = (String)request.getAttribute("msg1");
		if(msg1 != null){
			out.println(msg1);
		}
	%>
	<div class="container">
		<h2>Student Registration Form</h2>
		<form action="StudentServlet" method="post">
			<div class="form-group">
				<label for="email">Email:</label> <input type="text" name="email">
			</div>
			<div class="form-group">
				<label for="password">Password:</label> <input type="password"
					name="password">
			</div>
			<div class="form-group">
				<input type="submit" name="action" value="login">Login
			</div>
		</form>
		
		
	</div>
</body>
</html>