<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>게시판 글쓰기</title>
    <script src="<c:url value='/js/jquery-1.12.4.js'/>"></script>
    <script>
    	$(document).ready(function(){
    		$("#submit").bind("click", function(){
    			$.ajax({
    				url : "/Board/board",
    				method : "POST",
    				dataType : "json",
    				contentType : "application/json;charset=utf-8",
    				data : JSON.stringify({
    					"name" : $("#name").val(),
    					"email" : $("#email").val(),
    					"title" : $("#title").val(),
    					"contents" : $("#contents").val() 
    				}),
    				success : function(data){
    					if(data.code){
    						alert("Insert Success");
    					}
    					location.href="/Board";
    				}
    			});
    		});
    	});
    </script>
</head>
<body>
    <h1>게시판 글쓰기</h1>
    <form method="POST" action="/Board/board">
        <ul style="list-style-type:none">
            <li>작성자: <input type="text" id="name" /></li>
            <li>Email : <input type="email" id="email" size="30" /></li>
            <li>제목 : <input type="text" id="title" size="40"/></li>
            <li>내용 : <textarea id="contents" rows="10" cols="40"></textarea></li>
        </ul>
        <input type="button" id="submit" value="글쓰기" />
        <input type="button" value="뒤로가기" onclick="javascript:history.back();"/>
    </form>
</body>
</html>