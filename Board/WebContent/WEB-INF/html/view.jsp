<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="board" value="${data }"/>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<script src="<c:url value='/js/jquery-1.12.4.js'/>"></script>
<script>

	$(document).ready(function() {
		//alert("${code}")
		$("#idx").text("${board.idx}");
		$("#writedate").text("${board.writedate}");
		$("#name").text("${board.name}");
		$("#readnum").text("${board.readnum}");
		$("#title").text("${board.title}");
		var contents="${board.contents}";
		contents=contents.replace(/<br\/>/gi,"\n")
		$("#contents").text(contents);
		$("#btnDelete").bind("click",function(){
			$.ajax({
				url:"/Board/board/"+${board.idx},
				method:"DELETE",
				success:function(data){
					location.href="/Board/"
				}
			})
		})
		var flag=true;
		$('#btnUpdate').bind("click",function(){
			
			if(flag){
				var title = $("#title").text();
				var str = "<input type='text' id='title' value='" + title + "' size='30' />";
				$("#title").replaceWith(str);
				$("#btnUpdate").text("갱신하기");
				flag=false;
			}else if(!flag){
				$.ajax({
					url:"/Board/board",
					method:"PUT",
					dataType:"json",
					contentType:"application/json;charset=utf-8",
					data: JSON.stringify({
						"idx":$("#idx").text(),
						"title":$('#title').val(),
						"contents":$('#contents').val()
					}),
					success: function(data){
						if(data.code){
							location.reload();
						}
					}
				})
			}
			
		})
	});
</script>
<title>Insert title here</title>
</head>
<body>
	<h1>게시판 글 확인</h1>
	<ul>
		<li>Num:<span id='idx'></span></li>
		<li>Date:<span id='writedate'></span> </li>
		<li>Writer:<span id='name'></span></li>
		<li>Readcount:<span id='readnum'></span></li>
		<li>Title:<span id='title'></span></li>
		<li>Contents:
			<textarea rows="5" cols="40"  id="contents" ></textarea>
		</li>
	</ul>
		<hr/>
	<div>
		<button onclick="javascript:location.href='/Board/';">목록으로</button>
		<button id="btnUpdate">수정하기</button>
		<button id="btnDelete">삭제하기</button>
		<button id="btnAnswer" onclick="javascript:location.href='answer';">답글하기</button>
	</div>
	
</body>
</html>