<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Scripting Tag</title>
</head>
<body>
	<% String date = new java.util.Date().toLocaleString();
	out.println("Today : " +date);%>
	<br>
	Today : <%=new java.util.Date()%>
</body>
</html>