<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Show Students</title>
<!-- Include Bootstrap CSS -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<h2>Students List</h2>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Mobile</th>
					<th>Gender</th>
					<th>Password</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${students}" var="student">
					<tr>
						<td>${student.id}</td>
						<td>${student.fname}</td>
						<td>${student.lname}</td>
						<td>${student.email}</td>
						<td>${student.mobile}</td>
						<td>${student.gender}</td>
						<td>${student.password}</td>
						<td><a href="edit.jsp?id=${student.id}"
							class="btn btn-primary">Edit</a> <a
							href="delete.jsp?id=${student.id}" class="btn btn-danger">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>