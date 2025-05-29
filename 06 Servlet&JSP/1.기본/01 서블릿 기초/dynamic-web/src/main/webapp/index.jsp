<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body bgcolor="aqua">
<%-- 개발시 run을 누르면
1.tomcat을 start!
2.현재 프로젝트 폴더를 만들고 파일을 옮겨줌
3. 브라우저를 열엇
4. 첫 페이지를(index.jsp)를 요청함
5. tomcat 은 해당 프로젝트 아래 index.jsp 를 찾아서
6. html 을 클라이언트 (브라우저)로 전송
7. html 을 받은 브라우저는 이것을 해석해서 예쁘로 보여줌
context( 프로젝트와 유사한 단어)
context path : 해당 프로젝트가 실제로 운영될 때 사용될 주소--%>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>