<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%!//���� : Ŭ���� ���� �ٷ� �Ʒ��� ����, �������� ��� ����������, �޼��� ���� ����
	int count = 3;

	String makeItLower(String data) {
		return data.toLowerCase();
	}%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Scripting Tag</title>
</head>
<body>
	<h2>Scripting Tag</h2>


	<%
	//��ũ��Ʋ�� :_JSPService() �޼��� �ȿ��� �����
	for (int i = 1; i <= count; i++) {
		out.println("Java Server Pages " + i + ".<br>");
	}
	%>

	<%=//ǥ���� : out.rint() ��ȣ �ȿ��� ����-> �����ݷ� ��������
		makeItLower("hello World")%>
</body>
</html>