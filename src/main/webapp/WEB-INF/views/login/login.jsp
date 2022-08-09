<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>로그인하기</h3>
<form action="login" method="post">
	아이디 : <input name="userId" type="text"><br>
	비밀번호 : <input name="passwd" type="password"><br>
	<input type="submit" value="로그인하기">
</form>

</body>
</html>