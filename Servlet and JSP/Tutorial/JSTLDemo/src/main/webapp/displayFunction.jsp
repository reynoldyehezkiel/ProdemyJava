<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Function</title>
</head>
<body>

	<c:set var="str" value="Navin Reddy is a Java Trainer in Mumbai"/>
	${str}
	<br><br>
	
	<!-- length() -->
	Length : ${fn:length(str)}
	<br><br>
	
	<!-- split() -->
	<c:forEach items="${fn:split(str,' ')}" var="s">
		${s}
		<br>	
	</c:forEach>
	<br>
	
	<!-- indexOf() -->
	Index : ${fn:indexOf(str,"is")}
	<br><br>
	
	<!-- contains() -->
	<c:if test="${fn:contains(str,'Java')}">
		"Java" is there
		<br><br>
	</c:if>
	
	<!-- endsWith() -->
	<c:if test="${fn:endsWith(str,'Trainer')}">
		You are right, the sentence is end with "Trainer"
		<br><br>
	</c:if>
	<c:if test="${!fn:endsWith(str,'Trainer')}">
		You are false, the sentence is not end with "Trainer"
		<br><br>
	</c:if>
	
	<!-- toLowerCase() -->
	${fn:toLowerCase(str)}
	<br><br>
	
	<!-- toUpperCase() -->
	${fn:toUpperCase(str)}
	<br><br>
	

</body>
</html>