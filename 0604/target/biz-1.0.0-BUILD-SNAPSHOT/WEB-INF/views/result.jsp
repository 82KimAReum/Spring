<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="user" value="${userVO }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과창</title>
</head>
<body>
	<h1>결과</h1>
	<ul>
		<li>name: ${user.name }</li>
		<li>age: ${user.age}</li>
		<li>id: ${user.userid}</li>
		
	</ul>
</body>
</html>