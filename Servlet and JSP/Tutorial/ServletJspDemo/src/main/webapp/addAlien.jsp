<%@page import="com.tutorial.web.model.Alien"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Alien</title>
</head>
<body bgcolor="green">
	<%
		out.println("Inserted Successfully");
	%>
		<br>
	<%
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