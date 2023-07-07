<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-06
  Time: 오후 2:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>마이 페이지</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/mypage.css" />
</head>
<body>
<form action="/user/mypage" method="post">
<table>
    <tbody>
        <tr id="id-area">
            <th>아이디</th>
            <td>${user.id}</td>
        </tr>
        <tr id="password-area">
            <th>비밀번호</th>
            <td><input type="password" value="${user.password}" name="password"></td>
        </tr>
        <tr id="name-area">
            <th>이름</th>
            <td><input type="text" value="${user.name}" name="username"></td>
        </tr>
        <tr id="address-area">
            <th>주소</th>
            <td><input type="text" value="${user.address}" name="address"></td>
        </tr>
        <tr id="phone-area">
            <th>핸드폰 번호</th>
            <td><input type="text" value="${user.phone}" name="phone"></td>
        </tr>
    </tbody>
</table>
    <input type="submit" value="수정">
</form>
</body>
</html>
