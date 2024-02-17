<%@ page import="sprproject.domain.member.Member" %><%--
  Created by IntelliJ IDEA.
  User: thsdn
  Date: 2024-02-17
  Time: 오후 2:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
    <li>id : ${member.id}</li>
    <li>name : ${member.username}</li>
    <li>age : ${member.age}</li>
</ul>
<a href="/index.html">메인</a>
</body>
</html>
