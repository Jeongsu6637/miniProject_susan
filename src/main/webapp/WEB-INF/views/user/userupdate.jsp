<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-06-19
  Time: 오후 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form method="post" action="/user/update">
  <input type="text"  value="${password}" name="password">
  <input type="text"  value="${name}" name="name">
  <input type="submit">
  </form>
</body>
</html>
