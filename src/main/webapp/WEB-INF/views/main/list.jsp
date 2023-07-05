<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table>
    <tr>
        <td>id</td>
        <td>content</td>
        <td>작성자</td>
        <td>작성일</td>
        <td>check</td>
        <td>수정</td>
    </tr>
    <c:forEach items="${todolist}" var = "todo">
        <tr>
            <td>${todo.id}</td>
            <td>${todo.name}</td>
        </tr>
    </c:forEach>

</table>
