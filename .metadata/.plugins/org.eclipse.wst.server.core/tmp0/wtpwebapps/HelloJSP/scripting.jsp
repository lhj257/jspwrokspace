<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%!//선언문 : 클래스 선언 바로 아래에 생성, 변수같은 경우 전역변수로, 메서드 생성 가능
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
	//스크립틀릿 :_JSPService() 메서드 안에서 실행됨
	for (int i = 1; i <= count; i++) {
		out.println("Java Server Pages " + i + ".<br>");
	}
	%>

	<%=//표현문 : out.rint() 괄호 안에서 생성-> 세미콜론 적지않음
		makeItLower("hello World")%>
</body>
</html>