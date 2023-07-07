<%--
  Created by IntelliJ IDEA.
  User: JS
  Date: 2023-07-06
  Time: 오전 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Detail</title>
    <link rel="stylesheet" href="../resources/detail.css">
</head>
<body>
<form method="post" action="/front/detail">
    <div class="detail">
        <div class="image_link"><img src="${image_link}"></div>
        <div class="info">
            <span class="storeInfo">
                <p>상호명: ${store_name}</p>
                <p>전화번호: ${store_number}</p>
                <p>주소: ${location}</p>
            </span>
            <p style="color:midnightblue;">판매상품 목록</p>
            <div class="menu">
                <c:forEach items="${showList}" var = "detail">
                    <ul>
                        <li>상품명: ${detail.name}</li>
                        <li>가격: ${detail.price}원</li>
                    </ul>
                </c:forEach>
            </div>
        </div>
    </div>
</form>
</body>
</html>
