<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 26. 1. 30.
  Time: 오후 2:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <a href="todo/register_0204">글쓰기</a>
</div>
<ul>
    <c:forEach var="dto" items="${dtoList}">
        <li>
                ${dto}
        </li>
    </c:forEach>
</ul>
</body>
</html>