<%--
  Created by IntelliJ IDEA.
  User: playdata
  Date: 2023-07-06
  Time: 오전 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>order Page</title>
</head>
<body>

    <h1> 물품 입력 화면 </h1>
    <form action="/product/insert" method="post">
      <input  type="text" placeholder="name" name="name">
      <input  type="text" placeholder="category" name="category">
      <button type="submit"> submit </button>
    </form>

</body>
</html>
