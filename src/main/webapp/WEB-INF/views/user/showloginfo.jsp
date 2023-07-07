<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>로그인 정보</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/showloginfo.css" />
</head>
<body>
<div class="container">
    <h1>회원 정보</h1>
    <table>
        <tr>
            <th>아이디</th>
            <td>${id}</td>
        </tr>
        <tr>
            <th>비밀번호</th>
            <td>${pw}</td>
        </tr>
    </table>
    <a href="/user/login">로그인</a>
</div>
</body>
</html>