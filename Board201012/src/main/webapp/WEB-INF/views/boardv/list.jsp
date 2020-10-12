<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>list.jsp</h1>
<table border="1">
	<tr><th>글번호</th>
		<th>제목</th> <th>글쓴이</th> <th>내용</th>
		<th>비밀번호</th> <th>날짜</th> <th>조회수</th>
	</tr>
	<c:forEach var="board" items="${boardList}">
		<tr>
			<td>${board.bnumber}</td>
			<td><a href="boardview?bnumber=${board.bnumber}">${board.btitle}</a></td>
			<td>${board.bwriter}</td>
			<td>${board.bcontents}</td>
			<td>${board.bpassword}</td>
			<td>${board.bdate}</td>
			<td>${board.bhits}</td>
			<%-- <td><button onclick="memberViewAjax('${member.mid}')">조회(ajax)</button></td>
			<td><a href="memberdelete?mid=${member.mid}">삭제</a></td>
			<td><a href="ajaxdelete('${member.mid})">삭제(ajax)</a></td>
			 --%>
	</c:forEach>
	</table>
</body>
</html>