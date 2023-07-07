<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-05
  Time: 오후 8:09
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Admin</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/admin.css" />
</head>
<body>
<div class="container">
    <header>
        <h1>상점 관리 페이지</h1>
    </header>
    <nav>
        <ul>
            <li><a href="/admin/store-info">상점 정보</a></li>
            <li><a href="/admin/product-info">상품 정보</a></li>
        </ul>
    </nav>
    <main>
        <%-- 상점 정보 등록 폼 --%>
        <section>
            <h2>상점 정보 등록</h2>
            <form method="post" action="/admin/store-info">
                <label for="storeName">상점 이름:</label>
                <input type="text" id="storeName" name="storeName" required><br>
                <label for="storeAddress">상점 주소:</label>
                <input type="text" id="storeAddress" name="storeAddress" required><br>
                <input type="submit" value="등록">
            </form>
        </section>
            <%-- 상품 정보 등록 폼 --%>
            <section>
                <h2>상품 정보 등록</h2>
                <form method="post" action="/admin/product-info">
                    <label for="productName">상품 이름:</label>
                    <input type="text" id="productName" name="productName" required><br>
                    <label for="productPrice">상품 가격:</label>
                    <input type="number" id="productPrice" name="productPrice" required><br>
                    <input type="submit" value="등록">
                </form>
            </section>
    </main>
    <footer>
        <p>사이트 정보 및 저작권 표시</p>
    </footer>
</div>
</body>
</html>
