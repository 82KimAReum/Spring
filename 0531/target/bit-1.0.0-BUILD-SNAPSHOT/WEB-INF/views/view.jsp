<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="name" value="${username}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${username}'s Information</h1>
	<h3>Name : <c:out value="${name}"/></h3>
	<h3>Age : ${userage}</h3>
	<h3>Job : ${job}</h3>
</body>
</html>