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
	<form action="" method = "post">
	사원 번호 : <input type="text" name="empno"><br>
	사원 이름 : <input type="text" name="ename"><br>
	직업  : <input type="text" name="job"><br>
	매니저  : <input type="text" name="mgr"><br>
	입사 일자  : <input type="date" name="hiredate"><br>
	월급  : <input type="text" name="sal"><br>
	커미션  : <input type="text" name="comm"><br>
	부선 번호 : <select  name="deptno">
	<option value="10">10</option>
	<option value="20">20</option>
	<option value="30">30</option>
	<option value="40">40</option>
	</select>
	<br>
	<button type="submit">입력</button>
	<input type="reset" value="리셋">
	
	</form>
</body>
</html>