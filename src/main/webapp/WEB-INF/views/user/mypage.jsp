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
</head>
<body>
<table>
    <tbody>
        <tr id="id-area">
            <th>아이디</th>
            <td>${user.id}</td>
        </tr>
        <tr id="password-area">
            <th>비밀번호</th>
            <td>**********</td>
            <td><button>비밀번호 변경</button></td>
        </tr>
        <tr id="name-area">
            <th>이름</th>
            <td>${user.name}</td>
        </tr>
        <tr id="address-area">
            <th>주소</th>
            <td>${user.address}</td>
        </tr>
        <tr id="phone-area">
            <th>핸드폰 번호</th>
            <td>${user.phone}</td>
        </tr>
    </tbody>
</table>
</body>
</html>
