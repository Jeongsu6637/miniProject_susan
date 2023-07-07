<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Main</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/front/main.css" />
</head>
<body>
<div class="container">

    <header>
        <img src="/resources/img/소래포구.png" alt="로고 이미지" class="logo">
    </header>

    <c:choose>
        <c:when test="${empty sessionScope.id}">
            <div class="user-menu">
                <a href="/user/login">로그인</a>
                <a href="/user/signup">회원가입</a>
            </div>
        </c:when>
        <c:otherwise>
            <div class="user-menu">
                <a href="/user/mypage?userId=${id}">마이 페이지</a>
                <a href="/front/cart?user_seq=${id}">장바구니</a>

            </div>
        </c:otherwise>
    </c:choose>

    <div class="search-form">
        <form method="post" action="/front/main">
            <input type="text" name="keyword" placeholder="검색어 입력">
            <input type="submit" value="검색">
        </form>
    </div>

    <%@ include file="list.jsp"%>
    <div class="product-list">
        <a href="/product/new1">신상품 1</a>
        <a href="/product/new2">신상품 2</a>
        <a href="/product/seasonal1">제철상품 1</a>
        <a href="/product/seasonal2">제철상품 2</a>
    </div>

    <footer>
        <p>사이트 정보 및 저작권 표시</p>
    </footer>
</div>
</body>
</html>