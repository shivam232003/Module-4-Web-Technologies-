<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Validation Form</title>
</head>
<body>

	<h2>Form Validation</h2>
	<form action="FormValidationServlet" method="post">
		First Name: <input type="text" name="fname" required><br>
		Last Name: <input type="text" name="lname" required><br>
		Mobile: <input type="text" name="mobile" required><br>
		Email: <input type="email" name="email" required><br>
		Password: <input type="password" name="password" required><br>
		<input type="submit" value="Submit">
	</form>

</body>
</html>