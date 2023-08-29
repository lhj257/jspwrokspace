<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		Enumeration en = request.getParameterNames();
		while(en.hasMoreElements()){
			String name= (String)en.nextElement();
			out.print("<h3>선택한 과일</h3>");
			String paramValue = request.getParameter(name);
			out.println(paramValue);
		}
%>
</body>
</html>