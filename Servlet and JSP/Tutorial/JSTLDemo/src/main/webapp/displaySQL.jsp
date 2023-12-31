<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display SQL</title>
</head>
<body>

<%--
	String name = request.getAttribute("label").toString();
	out.println(name);
--%>

	<c:forEach items="${students}" var="s">
		${s.name}<br>
	</c:forEach>
	
	<br>

	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/mario" user="root" password=""/>
	
	<sql:query var="rs" dataSource="${db}">select * from gadgets</sql:query>
	
	<c:forEach items="${rs.rows}" var="gadget">
		<c:out value="${gadget.gid}"></c:out> : <c:out value="${gadget.gname}"></c:out> : <c:out value="${gadget.price}"></c:out>
		<br>
	</c:forEach>

</body>
</html>