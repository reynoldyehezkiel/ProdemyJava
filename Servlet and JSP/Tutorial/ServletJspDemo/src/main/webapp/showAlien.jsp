<%@page import="com.tutorial.web.model.Alien"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Alien</title>
</head>
<body bgcolor="cyan">

	<%
		// RequestDispatcher
//		Alien a1 = (Alien) request.getAttribute("alien");
		
		// HttpSession
		Alien a = (Alien) session.getAttribute("alien");
		
		out.println("ID: " + a.getAid());
	%>
		<br>
	<%
		out.println("Name: " + a.getAname());
	%>
		<br>
	<%
		out.println("Tech: " + a.getTech());
	%>

</body>
</html>