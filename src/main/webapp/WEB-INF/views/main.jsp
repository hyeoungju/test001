<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>메인 페이지</h3>
${userId }님, 환영합니다.
<button type="button" class="category_name" onclick='location.href="<c:url value='/login/login'/>"'>로그아웃</button>
</body>
</html>