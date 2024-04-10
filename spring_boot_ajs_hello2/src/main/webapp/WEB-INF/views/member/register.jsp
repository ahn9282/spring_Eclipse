<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/member/register" method="post">
아이디 : 
<input type="text" value="" name="id">${id }${memberVo.id }<br>
패수워드 : 
<input type="text" value="" name="pw">${pw }${memberVo.pw}<br>
이름 : 
<input type="text" value="" name="name">${name }${memberVo.name}<br>
이메일 : 
<input type="text" value="" name="email">${email}${memberVo.email}<br>
나이 : 
<input type="text" value="" name="age">${age }${memberVo.age }<br>
<button type="submit">등록</button>
<input type="reset" value="리셋">
</form>

<h1>리다이렉트 </h1>
   <form action="${pageContext.request.contextPath}/redirect/check" method="post">
      아이디 입력: <input type="text" name="id"><br>
      <input type="submit" value="제출">
   </form>

</body>
</html>