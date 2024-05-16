<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>
	
	<div class="container">
		<h2>Student Registration Form</h2>
		<form action="StudentServlet" method="post">
			<div class="form-group">
				<label for="fname">First Name:</label> <input type="text" id="fname"
					name="fname">
			</div>
			<div class="form-group">
				<label for="lname">Last Name:</label> <input type="text"
					name="lname">
			</div>
			<div class="form-group">
				<label for="email">Email:</label> <input type="text" name="email">
			</div>
			<div class="form-group">
				<label for="mobile">Mobile:</label> <input type="text" name="mobile">
			</div>
			<div class="form-group">
				<label for="mobile">Gender:</label> 
				<input type="radio" name="gender" value="male">Male
				<input type="radio" name="gender" value="female">Female
			</div>
			<div class="form-group">
				<label for="password">Password:</label> <input type="password"
					name="password">
			</div>
			<div class="form-group">
				<button type="submit" name="action" value="register">Register</button>
			</div>
			<div class="form-group">
				<input type="submit" name="action" value="register">Submit
			</div>
		</form>
		
		
	</div>
</body>
</html>