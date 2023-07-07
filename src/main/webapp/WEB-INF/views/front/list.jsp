<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table>
    <tr>
        <td>상호명</td>
    </tr>
    <tr>
        <td><a href="/front/main?keyword=${keyword}&category=a">기본순</a></td>
        <td><a href="/front/main?keyword=${keyword}&category=b">가격이 높은순</a></td>
        <td><a href="/front/main?keyword=${keyword}&category=c">가격이 낮은순</a></td>
    </tr>
    <c:forEach items="${searchlist}" var = "search">
        <tr>
            <td>${search.name}</td>
            <div style="display:flex;">
                <a style="display:block;" href="/front/detail?name=${search.name}">
                    <img style="height: 100px" src="${search.image_link}">
                </a>
            </div>
        </tr>
    </c:forEach>
</table>
