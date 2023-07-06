
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원 정보 찾기</title>
</head>
<body>
<h1>회원 정보 찾기</h1>
<form method="post" action="/user/idfind">
    <label for="phone">핸드폰 번호:</label>
    <input type="text" id="phone" name="phone" required><br>
    <input type="submit" value="조회">
</form>
</body>
</html>