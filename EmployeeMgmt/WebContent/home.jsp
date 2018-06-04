<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<h1>javasoft's employee lists</h1>
	<table border="1">
		<thead >
		<tr>
			<th>사번</th><th>사원명</th>
			<th>직무</th><th>입사일</th>
		</tr>
		</thead>
		<tbody>
			<c:forEach items="${emplist }" var="emp">
				<tr>
					<td>${emp.empno }</td>
					<td>${emp.ename }</td>
					<td>${emp.job }</td>
					<td>${emp.hiredate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>