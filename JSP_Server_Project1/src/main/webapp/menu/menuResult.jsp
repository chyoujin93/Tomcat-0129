<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 26. 1. 29.
  Time: 오후 3:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");  // ★ POST 한글 깨짐 방지 (가장 중요)
%>
<html>
<head>
    <title>menuResult</title>
</head>
<body>
<h1>주문내역</h1>
<h2> 주문메뉴 : ${param.menu} </h2>
<h2> 가격 : ${param.price} </h2>
</body>
</html>

