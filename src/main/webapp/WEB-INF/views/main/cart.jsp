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
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: white;
      margin: 0;
      padding: 0;
    }

    .container {
      max-width: 600px;
      margin: 20px auto;
      background-color: #fff;
      padding: 20px;
      border-radius: 5px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    h2 {
      text-align: center;
      margin-top: 0;
    }

    table {
      width: 100%;
      border-collapse: collapse;
      margin-top: 20px;
    }

    th, td {
      padding: 10px;
      text-align: center;
      border-bottom: 1px solid #ddd;
    }

    tr:nth-child(even) {
      background-color: #f2f2f2;
    }
  </style>
</head>
<body>
<table>
  <h2>내 장바구니 리스트</h2>
  <tr style="text-align: center;">
    <td>상품명</td>
    <td>가게명</td>
    <td>가격</td>
  </tr>
  <%--9번--%>
  <c:set var="totalPrice" value="0" />
  <c:set var="totalQuantity" value="0" />
  <c:forEach items="${cartlist}" var="cart">
    <tr>
      <td>${cart.name}</td>
      <td>${cart.store_name}</td>
      <td>${cart.price}</td>
    </tr>
    <%-- 가격의 총 합을 계산하여 totalPrice 변수에 저장합니다. --%>
    <c:set var="totalPrice" value="${totalPrice + cart.price}" />
    <%-- 상품 개수를 계산하여 totalQuantity 변수에 저장합니다. --%>
    <c:set var="totalQuantity" value="${totalQuantity + 1}" />
  </c:forEach>
  <%-- 가격의 총 합과 상품 개수를 마지막 행으로 추가합니다. --%>
  <tr>
    <td colspan="2">총 상품 개수: ${totalQuantity}</td>
    <td style="text-align: right;">총 합계: ${totalPrice}</td>
  </tr>
</table>
</body>
</html>
