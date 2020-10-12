<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
/* 	function update(){
		var bpassword = ${bpassword}.val();
		Console.log("비밀번호 : "+bpassword);
		if(bpassword==${boardUpdate.bpassword}){
			updateform.submit();
		}else{
			alert()
		}
	} */
	
	function update(){
		var password = '${boardUpdate.bpassword}'
		var passConfirm = document.getElementById("bpassword").value;
		if(password == passConfirm){
			updateform.submit();
		}else{
			alert("비밀번호가 틀립니다.");
		}
	}
</script>
</head>
<body>
<h1>update.jsp</h1>
		<form action="boardupdateprocess" name="updateform" method="post">
		글번호<br> <input type="text" name="bnumber" id="bnumber" size="50px" value="${boardUpdate.bnumber}" redonly><br>
		<p></p>
		제목<br> <input type="text" name="btitle" id="btitle" size="50px" value="${boardUpdate.btitle}"><br>
		<p></p>
		글쓴이<br> <input type="text" name="bwriter" id="bwriter" size="50px" value="${boardUpdate.bwriter}"><br>
		<p></p>
		내용<br>
		<textarea cols="50" rows="5" id="bcontents" name="bcontents">${boardUpdate.bcontents}</textarea>
		<p></p>
		비밀번호<br> <input type="password" name="bpassword" id="bpassword" size="50px" placeholder="비밀번호를 입력하세요"><br>
		<p></p>
		<button onclick="update()">수정하기</button>
		<button onclick="boardlist">글 목록</button>
</form>
</body>
</html>