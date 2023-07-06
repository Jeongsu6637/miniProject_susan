<%--
  Created by IntelliJ IDEA.
  User: Playdata
  Date: 2023-06-26
  Time: 오전 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>사용자 회원가입</title>
</head>
<body>
<form method="post" action="/user/signup">
    <table>
        <tr>
            <th>아이디</th>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <th>비밀번호</th>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <th>비밀번호 확인</th>
            <td><input type="password" name="confirmPassword"></td>
        </tr>
        <tr>
            <th>이름</th>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <th>주소</th>
            <td><input type="text" name="address"></td>
        </tr>
        <tr>
            <th>전화번호</th>
            <td><input type="text" name="phone"></td>
        </tr>

<%--        <tr>--%>
<%--            <th>모드</th>--%>
<%--            <td>--%>
<%--                <label><input type="radio" name="mode" value="1"> 관리자</label>--%>
<%--                <label><input type="radio" name="mode" value="2"> 일반 유저</label>--%>
<%--            </td>--%>
<%--        </tr>--%>
        <tr>
            <td colspan="2" style="text-align: center;">
                <input type="submit" value="가입하기">
            </td>
        </tr>

    </table>
</form>
<a href="/user/login">로그인</a>
</body>
</html>

