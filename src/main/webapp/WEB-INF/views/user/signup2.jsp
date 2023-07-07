<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/signup.css" />
</head>
<body>
<div class="container">
    <h2>상점 대표 회원가입</h2>
    <form method="post" action="${pageContext.request.contextPath}/user/signup">
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
            <tr>
                <td><input type='hidden' name='idType' value='2' /></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center;">
                    <input type="submit" value="가입하기">
                </td>
            </tr>
        </table>
    </form>
    <a href="/user/login">로그인</a>
</div>
</body>
</html>