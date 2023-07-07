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
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #F6F6F6;
      margin: 0;
      padding: 20px;
    }

    .container {
      max-width: 1000px;
      margin: 0 auto;
      background-color: #FFF;
      padding: 20px;
      border-radius: 5px;
      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
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

    form {
      display: inline-block;
    }

    input[type="submit"] {
      padding: 8px 16px;
      text-decoration: none;
      border-radius: 4px;
      font-weight: bold;
      background-color: #FF9800;
      color: #FFF;
      border: none;
      cursor: pointer;
    }
  </style>
</head>
<body>
<div class="container">
  <table>
    <tr>
      <th>가게명</th>
      <th>상품명</th>
      <th>카테고리</th>
      <th>가격</th>
      <th>재고</th>
      <th></th>
    </tr>
    <%--
    5번
    StoreController 에서 보내준 해당하는 상점의 모든 메뉴를 menulist 로 받아왔기 때문에
    해당하는 상점의 모든 메뉴들을 보여주고 있다.

    밑에 장바구니 추가로 가보자.
    --%>
    <c:forEach items="${menulist}" var="menu">
      <tr>
        <td>${menu.store_name}</td>
        <td>${menu.name}</td>
        <td>${menu.category}</td>
        <td>${menu.price}</td>
        <td>${menu.count}</td>
        <td>
            <%--6번
              장바구니 추가 버튼을 누르면

              @PostMapping /main/menu/ 로 가겠지.?

              근데 store_req(상점의고유번호) 랑 menu.menu_seq (메뉴의 고유번호) 를 가지고 가겠네..

              StoreController 로 한번 가보자!
            --%>
          <form method="post" action="/main/menu/${store_req}/${menu.menu_seq}">
            <input type="submit" value="장바구니 추가">
          </form>
        </td>
      </tr>
    </c:forEach>
  </table>
</div>
</body>
</html>