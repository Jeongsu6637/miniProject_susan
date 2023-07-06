<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-06
  Time: 오후 8:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>장바구니</title>
</head>
<body>
  <table>
    <h2>내 장바구니 리스트</h2>
    <tr style="text-align: center;">
      <td>상품명</td>
      <td>가게명</td>
      <td>가격</td>
    </tr>
    <%--9번

    --%>
    <c:forEach items="${cartlist}" var="cart">
      <tr>
        <td>${cart.name}</td>
        <td>${cart.store_name}</td>
        <td>${cart.price}</td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
