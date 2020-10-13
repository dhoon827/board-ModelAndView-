<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
<script>

</script>
</head>
<body>
<h1>Home.jsp</h1>

	<button onclick="location.href='boardwriteform'">글쓰기</button>
	<button onclick="location.href='boardwritefileform'">글쓰기(파일첨부)</button>
	<button onclick="location.href='boardlist'">글목록</button>
	<button onclick="location.href='boardlistpaging'">페이징글 목록</button>
</body>
</html>
