<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function checkLogin() {
		var form = document.loginForm;
		if (form.id.value == "") {
			alert("아이디를 입력해주세요.");
			form.id.focus();
			return false;
		} else if (form.passwd1.value.includes(form.id.value)) {
			alert("비밀번호는 ID를 포함할 수 없습니다.");
			form.passwd.focus();
			return false;
		}else if () {
			alert("영문, 숫자는 3자 이상 연속 입력할 수 없습니다.");
			form.passwd.focus();
			return false;
		}
		form.submit();
	}
</script>
<body>
	<form name="loginForm" action="validation01_process.jsp" method="post">
		<p>
			아이디 : <input type="text" name="id">
		<P>
			비밀번호 : <input type="text" name="passwd1">
		<P>
			비밀번호 확인 : <input type="text" name="passwd2">
		<p>
			<input type="button" value="전송" onclick="checkLogin()">
	</form>
</body>
</html>