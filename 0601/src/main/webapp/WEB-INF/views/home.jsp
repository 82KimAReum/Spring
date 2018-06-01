<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false"  contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
	<table>
		<thead>
			<th>아이디</th><th>이름</th><th>성별</th><th>거주지</th>
		</thead>
		<tbody>
			<c:forEach items="${memberlist }" var="member">
				<tr>
					<td><a href="view/${member.userid}">${member.userid }</a></td>
					<td>${member.name }</td>
					<td>${member.gender}</td>
					<td>${member.city }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>
