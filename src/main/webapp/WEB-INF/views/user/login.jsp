<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/login.css" />
</head>
<body>
<div class="container" style="text-align: center; ">
    <h2>로 그 인</h2>
    <form method="post" action="/user/login">
        <input type="text" name="id" placeholder="아이디를 입력해주세요" value="${id}"><br>
        <input type="password" name="password" placeholder="비밀번호를 입력해주세요"><br><br>
        <div style="text-align: right">
            <a href="/user/idfind">아이디·비밀번호 찾기</a><br><br>
        </div>
        <input type="submit" value="로그인"><br>
    </form>
    <a href="/user/signup" class="signup-button">회원가입</a><br><br>
    <p style="white-space: nowrap;">사업자이신가요?&nbsp;&nbsp;<a href="/user/signup2">사업자 회원 가입하기 &gt;</a></p>
</div>
</body>
</html>