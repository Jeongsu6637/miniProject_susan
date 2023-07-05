<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>main</title>
</head>
<body>

<%--    <%--%>
<%--        if(session.getAttribute("uid")==null)--%>
<%--            response.sendRedirect("/login");--%>
<%--    %>--%>


    <%@ include file="list.jsp"%>
    <form method="get" action="/main/main">
        <input type="text" name="keyword">
        <input type="submit" value="찾기">
    </form>
</body>
</html>