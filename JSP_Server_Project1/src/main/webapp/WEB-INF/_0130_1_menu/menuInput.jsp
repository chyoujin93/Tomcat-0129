<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 26. 1. 30.
  Time: 오전 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--action의 주소를 컨트롤러의 경로로 변경, : /calc/makeResult--%>
<h1>MVC,C 컨트롤러의 역할 확인중. doGET, 화면제공 </h1>
<form action="/menu/result" method="post">
    <input type="text" name="menu">
    <button type="submit">주문</button>
</form>
</body>
</html>
