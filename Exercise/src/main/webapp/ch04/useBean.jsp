<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action Tag</title>
</head>
<body>
	<h4>구구단 출력하기</h4>
	<jsp:useBean id="bean" class="ch04.com.dao.GuGuDan" >
	<%
	out.print(bean.process(5));
	%>
	</jsp:useBean>
</body>
</html>