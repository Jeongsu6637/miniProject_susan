<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-06
  Time: 오후 8:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form method="get" action="cart.jsp">
    <a href="/main/cart">장바구니</a>
  </form>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Main</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/main.css" />
</head>
<body>
<header>
    <nav>
        <ul>
            <li><a href="#">신상품</a></li>
            <li><a href="#">제철상품</a></li>
            <li><a href="#">카테고리1</a></li>
            <li><a href="#">카테고리2</a></li>
            <li><a href="#">카테고리3</a></li>
        </ul>
    </nav>
    <div class="right">
        <a href="/user/login">로그인</a>
        <a href="/user/signup">회원가입</a>
        <a href="/user/signup2">사업자회원가입</a>
    </div>
</header>
<main>
    <section>
        <h2>상점 정보</h2>
        <p>상점 정보 내용</p>
    </section>
    <section>
        <h2>상품명</h2>
        <p>상품 내용</p>
    </section>
    <section>
        <h2>게시판</h2>
        <p>게시판 내용</p>
    </section>
</main>
<footer>
    <a href="#">장바구니</a>
</footer>
</body>
</html>