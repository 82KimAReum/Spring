<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="user" value="${memberVO}" />
<!-- <c:set var="user" value="${m}" /> -->

<h1>${code}</h1>
<ul>
	<li>이름 : ${user.name}</li>
	<li>아이디 : ${user.userid}</li>
	<li>성별 : ${user.gender}</li>
	<li>거주지 : ${user.city}</li>
</ul>