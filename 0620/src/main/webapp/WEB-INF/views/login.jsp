<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>로그인 페이지</title>
<meta charset="UTF-8">
<script>
	function doLogin() {
		if (frm.j_username.value == "") {
			alert("아이디를 입력해주세요.");
			return;
		}
		if (frm.j_password.value == "") {
			alert("패스워드를 입력해주세요.");
			return;
		}
		frm.submit();
	}
</script>
</head>
<body>
	<form name="frm" action="j_spring_security_check" method="post">
	<ul>
		<li>
		<label for="userID">ID</label> 
		<input id="userID" type="userID" name="j_username" placeholder="ID" required></li>
		<li>
		<label for="password">Password</label> 
		<input id="password" type="password" name="j_password"
				placeholder="PASSWORD" /></li>
		<li><input type="button" value="로그인" onclick="doLogin()"/></li>
	</ul>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>
	<c:if test="${not empty error}">
		<div class="error">${error}</div>
	</c:if>
	<c:if test="${not empty msg}">
		<div class="msg">${msg}</div>
	</c:if>
</body>
</html>