<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Scripting Tag</title>
</head>
<body>
	<%! String str = "Hello, Java Server Pages";
	String getString(){
		return str;
	}%>
	<%= getString() %>
</body>
</html>