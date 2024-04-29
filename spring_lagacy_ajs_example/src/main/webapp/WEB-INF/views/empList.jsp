<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>게시판</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous">
	
</script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<style>
td, th {
	border: 1px solid #aaaaaa;
	width: 100px;
	text-align: center;
}
</style>

</head>
<body>
<%int count =1; 
int pageCount = 1;%>
	<table border="1">
		<tr>
		<th>번호</th>
			<th>사원 번호</th>
			<th>사원 이름</th>
			<th>직책</th>
			<th>급여</th>
			

		</tr>
		<%
			int l = 1 + count * 5;
		%>
		<c:forEach var="board" items="${emps}">
			<tr>
				<td><%=count%></td>
			
				<td>${board.empno}</td>
				<td>${board.ename}</td>
				<td>${board.job}</td>
				<td>${board.sal}</td>
			
			
			</tr>
			<%
				count++;
			%>
		</c:forEach>
	</table>

	
</body>
</html>