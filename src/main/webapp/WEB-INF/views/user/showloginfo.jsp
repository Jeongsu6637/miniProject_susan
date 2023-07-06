<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-06
  Time: 오전 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>로그인 정보</title>
</head>
<body>
<h1>로그인 정보</h1>
<form method="get" action="/user/showloginfo">
<p>ID: ${id}</p>
<p>Password: ${password}</p>
</form>
</body>
</html>