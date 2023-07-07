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
    <link rel="stylesheet" type="text/css" href="/resources/css/product_1.css?a">
    <title>product Update</title>
</head>
<body>
<%--<h1> ${seq}번 프로덕트 업데이트 화면</h1>--%>

<%--<form action="/product/update" method="postf">--%>

<%--    <input type="number" name="seq" value="${seq}" readonly>--%>
<%--    <input  type="text" placeholder="name" name="name">--%>
<%--    <input  type="text" placeholder="category" name="category">--%>
<%--    <button type="submit"> submit </button>--%>
<%--</form>--%>

<div class="edit_layout">
    <div class="info_box">

        <h1>${seq}번 물품 수정 페이지 입니다.</h1>
        <form method="post" action="/product/update">
            <table class="info_table">
                <tr>
                    <th>물품 번호</th>
                    <td><input  type="number" name="seq" value="${seq}" readonly><td>
                </tr>
                <tr>
                    <th>이름</th>
                    <td><input  type="text" placeholder="name" name="name"><td>
                </tr>
                <tr>
                    <th>카테고리</th>
                    <td><input  type="text" placeholder="category" name="category"><td>
                </tr>
            </table>

            <div class="btn_box">
                <input type="submit" value="입력">
            </div>

        </form>

    </div>
</div>

</body>
</html>
