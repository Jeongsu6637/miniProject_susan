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
    <title>Detail</title>
</head>
<body>
    <form method="post" action="/front/detail">
        <div class="detail">
            <td><img src="${image_link}" alt=""></td>
            <td>${store_name}</td>
            <td>${store_number}</td>
            <td>${location}</td>
            <c:forEach items="${showList}" var = "detail">
                <tr>
                    <td>${detail.name}</td>
                    <td>${detail.price}</td>
                </tr>
            </c:forEach>
        </div>
    </form>
</body>
</html>
