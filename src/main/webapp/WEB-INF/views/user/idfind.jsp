<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원 정보 찾기</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/idfind.css" />
</head>
<body>
<div class="container" style="text-align: center">
    <h1>회원 정보 찾기</h1>
    <form method="post" action="/user/idfind">
        <input type="text" id="phone" name="phone" placeholder="핸드폰 번호를 입력해주세요"><br>
        <input type="submit" value="조회">
    </form>
</div>
</body>
</html>