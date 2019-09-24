<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String message = (String)request.getAttribute("message");
%><!-- 메서드 안에 java코드 // request는 내장 객체 // object를 String으로 다운 캐스팅 해줘야 한다.-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>error</title>
</head>
<body>
<h1>에러 발생 : <%= message %> </h1>
<!-- out.print == -->
<h2><a href="/first/index.jsp">홈으로 이동</a></h2>
</body>
</html>