<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Student Form</title>
</head>
<body>

	<jsp:include page="header.jsp" />
	
<center>
		<fieldset>
			<legend>Edit Student Form</legend>
			<form action="${pageContext.request.contextPath}/edit_student_action" method="POST">
				
				<input type="hidden" name="id" value="${student.id}" />
				
				Name: <input type="text" name="name" placeholder="Student Name" value="${student.name}"/><br/>
				
				Age: <input type="text" name="age" placeholder="Age" value="${student.age}"/><br/>
				
				City: <input type="text" name="city" placeholder="City" value="${student.city}"/><br/>				
				
				<input type="submit" value="Save"/>
				
				<input type="Reset" value="Clear Form"/>
			</form>
		</fieldset>
	</center>


</body>
</html>