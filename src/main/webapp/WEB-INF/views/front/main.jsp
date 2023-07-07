<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>main</title>
</head>
<body>

<form method="post" action="/front/main">
    <input type="text" name="keyword">
    <input type="submit" value="검색">
</form>
<%@ include file="list.jsp"%>

</body>
</html>