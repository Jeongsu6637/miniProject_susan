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
    <link rel="stylesheet" href="../resources/main.css">
</head>
<body>
    <form method="post" action="/front/detail">
        <div class="detail">
            <td>
                <div class="image_link"><img src="${image_link}"></div>
            </td>
            <div class="info">
                <p>상호명 : ${store_name}</p>
                <p>전화번호 : ${store_number}</p>
                <p>주소 : ${location}</p>
                <c:forEach items="${showList}" var = "detail">
                    <ul>
                        <li>${detail.name}</li>
                        <li>${detail.price}</li>
                    </ul>
                </c:forEach>
            </div>

        </div>
    </form>
</body>
</html>
