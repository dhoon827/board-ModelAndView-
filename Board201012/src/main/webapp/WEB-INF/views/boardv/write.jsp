<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>write.jsp</h1>
<form action="boardwrite" method="post">
		제목<br> <input type="text" name="btitle" id="btitle" size="50px"><br>
		<p></p>
		글쓴이<br> <input type="text" name="bwriter" id="bwriter" size="50px"><br>
		<p></p>
		내용<br>
		<textarea cols="50" rows="5" id="bcontents" name="bcontents"></textarea>
		<p></p>
		비밀번호<br> <input type="password" name="bpassword" id="bpassword" size="50px" placeholder="비밀번호를 입력하세요"><br>
		<p></p>
		<input type="submit" value="글쓰기">
</form>

</body>
</html>