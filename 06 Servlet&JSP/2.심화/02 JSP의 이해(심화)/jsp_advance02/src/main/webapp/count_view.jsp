<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 25. 6. 24.
  Time: 오전 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>방문자수 조회하기</title>
</head>
<body>
<h1>방문자수 조회하기 화면</h1>
<%
    int count = (Integer)application.getAttribute("countValue");
%>
현재까지 총 방문자수 : <%=count%>
</body>
</html>
