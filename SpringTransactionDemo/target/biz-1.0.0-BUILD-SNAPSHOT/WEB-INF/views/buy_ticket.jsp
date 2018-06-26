<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ticket 구매 창</title>
</head>
<body>
<h1>카드 결제</h1>

<form action="buy_ticket_card" method="post">
고객 아이디 : <input type="text" name="consumerId" > <br />
티켓 구매수 : <input type="text" name="amount" > <br />
<input type="submit" value="구매" > <br />
</form>

</body>
</html>