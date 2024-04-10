<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>shape</title>
</head>
<body>
<h1>Shape</h1>
<form action="${pageContext.request.contextPath }/shape/circle" method="get">
반지름 입력 : 
<input value="" name="radius">
<button type="submit">등록</button>
</form>
</body>
</html>