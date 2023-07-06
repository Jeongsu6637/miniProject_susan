<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-07-06
  Time: 오후 3:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>가게 보기</title>
</head>
<body>
  <table>
    <tr>
      <td>store_seq</td>
      <td>가게명</td>
      <td>위치</td>
      <td>전화번호</td>
      <td>link</td>
      <td></td>
    </tr>
    <%--
    2번
      storeController 에서 stores 변수를 내려줬기 때문에 여기서 쓸수있는것.. 이제 아래에 상점들어가기쪽을 살펴보자..
    --%>
    <c:forEach items="${stores}" var="store">
      <tr>
        <td>${store.store_seq}</td>
        <td>${store.store_name}</td>
        <td>${store.store_name}</td>
        <td>${store.store_number}</td>
        <td>${store.image_link}</td>

        <%--
        3번
          상점들어가기를 누르면..
          /main/menu/?store_seq=상점번호 가 들어가기 때문에 내가 누른 상점의 store_seq가 파라미터로 붙게될거고
          @GetMapping /main/menu/ 쪽으로 가보면 파라미터를 받을 수 있을것임 가보자..
        --%>
        <td><a href="/main/menu?store_seq=${store.store_seq}">상점들어가기</a> </td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
