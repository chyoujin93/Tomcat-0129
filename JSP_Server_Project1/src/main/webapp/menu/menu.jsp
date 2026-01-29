<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 26. 1. 29.
  Time: 오후 3:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>menu입력</title>
</head>
<body>
<form action="menuResult.jsp" method="post">

   메뉴: <input type = "text" name="menu">
    <input type = "number" name="price">
    <button type="submit"> 주문 </button>

</form>
</body>
</html>
