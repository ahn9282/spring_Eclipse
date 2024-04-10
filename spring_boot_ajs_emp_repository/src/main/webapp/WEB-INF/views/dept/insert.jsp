<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/dept/register" method = "post">
	부서 번호 : <input type="text" name="deptno"><br>
	부서 이름 : <input type="text" name="dname"><br>
	지역  : <input type="text" name="ioc"><br>
	<button type="submit">입력</button>
	<input type="reset" value="리셋">
	
	</form>
</body>
</html>