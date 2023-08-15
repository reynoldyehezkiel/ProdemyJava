<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	
	<center>
		<fieldset>
			<legend>Login Form</legend>
			<form action="${pageContext.request.contextPath}/login_action" method="POST">
				
				<input type="text" name="username" placeholder="username" autocomplete="off"/><br/>
				
				<input type="password" name="password" placeholder="password"/><br/>
				
				<input type="submit" value="Login"/>
			</form>
		</fieldset>
	</center>

</body>
</html>