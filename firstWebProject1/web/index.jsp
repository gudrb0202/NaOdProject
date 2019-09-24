<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.model.vo.Member" %>
<%
	Member loginMember = (Member)session.getAttribute("loginMember");  
	/* 로그인 하지 않 */
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>first</title>
<link rel="stylesheet" type="text/css" href="/first/resources/css/main.css">
</head>
<body>
<header>
<h1>first</h1>
<nav>
<ul>
	<li><a>홈</a></li>
	<li><a>공지사항</a></li>
	<li><a>댓글게시판</a></li>
	<li><a>자료실</a></li>
	<li><a>QnA</a></li>
</ul>
</nav>
</header>
<hr>
<% if(loginMember == null){ %>

<div id="loginbox">
<form action="/first/login" method="post">
<input type="text" name="userid" id="userid"><br>
<input type="password" name="userpwd" id="userpwd"><br>
<input type="submit" value="로그인"> &nbsp; 
<a href="/first/views/member/memberEnroll.html">회원가입</a> <br>
</form>
<button onclick="">아이디/암호찾기</button>
</div>
<% }else{ %>
	<div id="loginbox">
	<%= loginMember.getUserName() %> 님, <a href=/first/logout>로그아웃</a> <br>
	메일 0개 쪽지 0 개<br>
	<a href="/first/myinfo?userid=<%= loginMember.getUserId() %>">내 정보보기</a>
	</div>
<% } %>
<div id="banner">
 <img src="/first/resources/images/d7.jpg" width="750" height="100">
</div>
<section>
본문 내용 표시 영역 <br>
<br><br><br><br><br><br><br><br>
</section>
<hr>
<footer>
copyright@iei.or.kr 작성자 : khmaster 2019-09-20 제작<br>
Tel : 02-1234-5678, Fax : 02-1234-6789, 서울시 강남구 역삼동
</footer>
</body>
</html>






