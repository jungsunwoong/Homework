<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 25. 6. 24.
  Time: 오전 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>방문자수 설정하기 화면</title>
</head>
<body>
<h1>방문자수 설정하기 화면</h1>
<%! int count ; %>
<%
    count++;
    application.setAttribute("countValue",count);
%>
현재 방문자수 : <%=count%>
</body>
</html>
