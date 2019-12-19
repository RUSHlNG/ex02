<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입</title>
</head>
<body>
	<form action="/ex02/Main" method="post">
		이름 : <input type="text" name="name" value=""><br>
		ID : <input type="text" name="ID" value=""><br>
		비밀번호 : <input type="password" name="pw" value=""><br>
		비밀번호 확인 : <input type="password" name="pwch" value=""><br>
		성별 : <input type="radio"><br>
		email : <input type="text" name="email" value=""><select></select><br>
		
		
<!-- 이름, id, 비밀번호, 확인, 성별, 생년월일, email, 전화번호 입력
	id,email 중복확인
	비밀번호 길이 8자리 문자+숫자
	비밀번호 비밀번호확인 같은지 확인
	한개라도 만족하지 않았을경우 틀린것 다시입력
	 -->
	</form>
</body>
</html>