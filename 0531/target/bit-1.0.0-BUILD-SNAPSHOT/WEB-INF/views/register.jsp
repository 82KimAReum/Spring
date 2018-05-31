<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Information</h1>
<ul>
	<c:forEach items="${userInfo}" var="info">
		<li>${info.key} : ${info.value}</li>
	</c:forEach>
</ul>