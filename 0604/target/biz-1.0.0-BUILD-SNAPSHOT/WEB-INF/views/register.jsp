<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 폼</title>
</head>
<body>
	<h1>회원가입</h1>
	<form method="post">
		<ul style="list-style-type: :none">
			<li>Name:<input type="text" name="name"/></li>
			<li>Age:<input type="number" name="age"/></li>
			<li>UserID:<input type="text" name="userid"/></li>
		</ul>
		<input type="submit" value="가입하기"/>
	</form>
</body>
</html>