<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ taglib prefix="jstcl" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<body>
	<jsp:include page="header.jsp" />

	<center>
		<h3>Students List</h3>
		<table border="1" cellspacing="5" cellpadding="10">
			<thead>
				<th>ID</th>
				<th>Name</th>
				<th>Age</th>
				<th>City</th>
				<th>Action</th>
			</thead>
			<jstcl:forEach var="student" items="${students_list}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.age}</td>
					<td>${student.city}</td>
					<td>
						<a href="edit?id=${student.id}">Edit</a>
						<a href="delete?id=${student.id}"
							onclick="javascript: return confirm('Are you sure you want to delete this record?');">Delete</a>
					</td>
				</tr>
			</jstcl:forEach>
		</table>
	</center>

</body>
</html>