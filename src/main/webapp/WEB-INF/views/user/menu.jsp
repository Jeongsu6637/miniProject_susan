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
</head>
<body>
  <table>
    <tr>
      <td>가게명</td>
      <td>상품명</td>
      <td>카테고리</td>
      <td>가격</td>
      <td>재고</td>
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
</body>
</html>
