<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ������</title>
</head>
<body>
	<form action="/ex02/Main" method="post">
		�̸� : <input type="text" name="name" value=""><br>
		ID : <input type="text" name="ID" value=""><br>
		��й�ȣ : <input type="password" name="pw" value=""><br>
		��й�ȣ Ȯ�� : <input type="password" name="pwch" value=""><br>
		���� : <input type="radio"><br>
		email : <input type="text" name="email" value=""><select></select><br>
		
		
<!-- �̸�, id, ��й�ȣ, Ȯ��, ����, �������, email, ��ȭ��ȣ �Է�
	id,email �ߺ�Ȯ��
	��й�ȣ ���� 8�ڸ� ����+����
	��й�ȣ ��й�ȣȮ�� ������ Ȯ��
	�Ѱ��� �������� �ʾ������ Ʋ���� �ٽ��Է�
	 -->
	</form>
</body>
</html>