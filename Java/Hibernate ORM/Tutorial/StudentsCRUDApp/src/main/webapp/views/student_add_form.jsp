<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student Form</title>
</head>
<body>

	<jsp:include page="header.jsp" />
	
<center>
		<fieldset>
			<legend>Add Student Form</legend>
			<form action="${pageContext.request.contextPath}/add_student_action" method="POST">
				
				<input type="text" name="name" placeholder="Student Name" autocomplete="off"/><br/>
				<input type="text" name="age" placeholder="Age"/><br/>
				<input type="text" name="city" placeholder="City"/><br/>				
				<input type="submit" value="Submit"/>
				<input type="Reset" value="Clear Form"/>
			</form>
		</fieldset>
	</center>


</body>
</html>