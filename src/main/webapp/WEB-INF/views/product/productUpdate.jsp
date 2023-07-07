<%--
  Created by IntelliJ IDEA.
  User: playdata
  Date: 2023-07-06
  Time: 오전 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>product Update</title>
</head>
<body>
<h1> ${seq}번 프로덕트 업데이트 화면</h1>

<<<<<<< HEAD
<form action="/product/update" method="postf">
=======
<form action="/product/update" method="post">
>>>>>>> a592db1caea2d6e41a9973e0f9df5f0405a74f55
    <input type="number" name="seq" value="${seq}" readonly>
    <input  type="text" placeholder="name" name="name">
    <input  type="text" placeholder="category" name="category">
    <button type="submit"> submit </button>
</form>

</body>
</html>
