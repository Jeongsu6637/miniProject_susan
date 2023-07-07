<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>인어해적 교주단</title>
    <link rel="stylesheet" href="../resources/main.css">
</head>
<body>
    <div>
        <span><h1 class="h1">인어해적 교주단</h1></span>
    </div>
    <div>
        <section class="main-content">
            <form method="post" action="/front/main">
                <input type="text" name="keyword" value="${keyword}">
                <input type="submit" value="검색">
            </form>
            <%@ include file="list.jsp"%>
        </section>
    </div>
</body>
</html>








