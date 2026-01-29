<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 26. 1. 29.
  Time: 오후 3:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>calcResult</title>
</head>
<body>
<%-- 서버에서 기본적으로 제공하는 기능들이 있음. 그중의 하나의 기능: param(객체)
    이친구는 웹브라우저 --%>
<h2> num1 : ${param.num1} </h2>
<h2> num2 : ${param.num2} </h2>
<h3> 합: ${Integer.parseInt(param.num1) + Integer.parseInt(param.num2) } </h3>
</body>
</html>

