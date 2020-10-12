<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>view.jsp</h1>
		글번호 : ${boardView.bnumber}<br>
		비밀번호 : ${boardView.bpassword}<br>
		작가 : ${boardView.bwriter}<br>
		글제목 : ${boardView.btitle}<br>
		글내용 : ${boardView.bcontents}<br>
		날짜 : ${boardView.bdate}<br>
		조회수 : ${boardView.bhits}
		<br>
		<a href="boardlist">글 목록 조회</a>
		<a href="boardupdate?bnumber=${boardView.bnumber}">글 내용 수정</a>
</body>
</html>