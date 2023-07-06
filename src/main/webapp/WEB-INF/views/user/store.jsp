<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-06
  Time: 오후 3:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>가게 보기</title>
</head>
<body>
  <table>
    <tr>
      <td>store_seq</td>
      <td>가게명</td>
      <td>위치</td>
      <td>전화번호</td>
      <td>link</td>
      <td></td>
    </tr>

    <c:forEach items="${stores}" var="store">
      <tr>
        <td>${store.store_seq}</td>
        <td>${store.store_name}</td>
        <td>${store.store_name}</td>
        <td>${store.store_number}</td>
        <td>${store.image_link}</td>
        <td><a href="/main/menu?store_seq=${store.store_seq}">상점들어가기</a> </td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
