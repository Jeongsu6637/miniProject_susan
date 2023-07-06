<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-06
  Time: 오후 4:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>가게 둘러보기</title>
</head>
<body>
  <table>
    <tr>
      <td>가게명</td>
      <td>상품명</td>
      <td>카테고리</td>
      <td>가격</td>
      <td>재고</td>
    </tr>

    <c:forEach items="${menulist}" var="menu">
      <tr>
        <td>${menu.store_name}</td>
        <td>${menu.name}</td>
        <td>${menu.category}</td>
        <td>${menu.price}</td>
        <td>${menu.count}</td>
      </tr>
    </c:forEach>

  </table>
</body>
</html>
