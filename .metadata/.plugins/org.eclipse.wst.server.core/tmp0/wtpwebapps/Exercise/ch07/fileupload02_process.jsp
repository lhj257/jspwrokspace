<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.commons.fileupload.DiskFileUpload"%>
<%@page import="java.io.File"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
</head>
<body>
	<%
	String path = "C:\\upload";

		DiskFileUpload upload = new DiskFileUpload();
		List items = upload.parseRequest(request);
		Iterator params = items.iterator();

		while (params.hasNext()) {
			FileItem item = (FileItem) params.next();

			out.println("요청 파라미터 이름 : " + item.getFieldName() + "<br>");
			out.println("저장 파일 이름 : " + item.getName() + "<br>");
			out.println("파일 콘텐츠 유형 : " + item.getContentType() + "<br>");
			out.println("파일 크기 : " + item.getSize());
		}
	%>
</body>
</html>