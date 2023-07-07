<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>가게 보기</title>
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

    h2 {
      text-align: center;
      margin-top: 0;
      color: #333;
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

    a {
      text-decoration: none;
      color: #000;
      font-weight: bold;
    }

    .button {
      display: inline-block;
      padding: 8px 16px;
      text-decoration: none;
      border-radius: 4px;
      font-weight: bold;
    }

    .button-blue {
      background-color: #2196F3;
      color: #FFF;
    }
  </style>
</head>
<body>
<div class="container">
  <h2>가게 보기</h2>
  <table>
    <tr>
      <th style="padding-right: 20px;">가게 번호</th>
      <th style="padding-right: 20px;">가게명</th>
      <th style="padding-right: 20px;">위치</th>
      <th style="padding-right: 20px;">전화번호</th>
      <th style="padding-right: 20px;"></th>
      <th></th>
    </tr>
    <c:forEach items="${stores}" var="store">
      <tr>
        <td>${store.store_seq}</td>
        <td>${store.store_name}</td>
        <td>${store.location}</td>
        <td>${store.store_number}</td>
        <td>
          <a href="/main/menu?store_seq=${store.store_seq}" style="display: inline-block;">
            <img src="${store.image_link}" alt="링크 이미지" style="max-width: 150px; max-height: 100px;">
          </a>
        </td>
        <td>
          <a href="/main/menu?store_seq=${store.store_seq}" class="button button-blue">상점들어가기</a>
        </td>
      </tr>
    </c:forEach>
  </table>
</div>
</body>
</html>


