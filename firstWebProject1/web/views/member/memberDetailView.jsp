<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.model.vo.Member" %>
    <%
    	Member member = (Member)request.getAttribute("member");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center"><%= member.getUserName() %>님의 가입 정보</h1>
<br>
<table align="center" width="500" cellpadding="3" cellspacing="0" border="1">
<tr><th>아이디</th><td><%= member.getUserId() %></td></tr>
<tr><th>암호</th><td><%= member.getUserPwd() %></td></tr>
<tr><th>성 별 </th><td><%= member.getGender() %></td></tr>
<tr><th>나 이</th><td><%= member.getAge() %></td></tr>
<tr><th>전화번호</th><td><%= member.getPhone() %></td></tr>
<tr><th>이메일</th><td><%= member.getEmail() %></td></tr>
<tr><th>취 미</th><td><%= member.getHobby() %></td></tr>
<tr><th>기 타</th><td><%= member.getEtc() %></td></tr>
<tr><th>가입날짜</th><td><%= member.getEnrollDate() %></td></tr>
<tr><th>마지막 수정날짜</th><td><%= member.getLastModified() %></td></tr>
<tr><th colspan="2">
	<a>수정페이지로 이동</a> &nbsp;
	<a href="/first/index.jsp">홈으로</a>
</th></tr>
</table>
</body>
</html>