<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>include 액션 실습</title>
</head>
<body>
<h1>include 태그 실습</h1>
현재 시간을 구하는 예제입니다. 다음줄에 삽입이 됩니다. <br>
<jsp:include page="header2.jsp" flush="true" >
    <jsp:param name="nickName" value=“홍길동" />
</jsp:include>
</body>
</html>