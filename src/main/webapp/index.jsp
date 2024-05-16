<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Registration Form</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
}

.container {
	max-width: 500px;
	margin: 50px auto;
	padding: 20px;
	background-color: #ffffff;
	border-radius: 10px;
	box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.1);
}

.form-group {
	margin-bottom: 20px;
}

.form-group label {
	display: block;
	font-weight: bold;
	margin-bottom: 5px;
}

.form-group input[type="text"], .form-group input[type="email"],
	.form-group input[type="tel"], .form-group select {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
}

.form-group input[type="radio"] {
	margin-right: 10px;
}

.form-group input[type="submit"] {
	background-color: #4CAF50;
	color: white;
	border: none;
	border-radius: 5px;
	padding: 10px 20px;
	cursor: pointer;
}
</style>
</head>
<body>

	<div class="container">
		<h2>Registration Form</h2>
		<form action="UserServlet" method="post">
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
				<label for="password">Password:</label> <input type="password"
					name="password">
			</div>
			<div class="form-group">
				<button type="submit" name="action" value="register">Register</button>
			</div>
			<div class="form-group">
				<button type="submit" name="action" value="show">Show
					Students</button>
			</div>
		</form>
		
		
	</div>

</body>
</html>
