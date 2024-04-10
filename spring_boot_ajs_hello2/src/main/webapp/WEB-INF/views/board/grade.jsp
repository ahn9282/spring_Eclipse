<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적표</title>
</head>
<body>
 grade()... <br>
 grade 실행됩니다.<br>
국어 : ${grade.kor}<br>
영어 : ${grade.eng }<br>
수학 : ${grade.math }<br>
총점 : ${grade.total() }<br>
평균 : ${grade.average() }<br>
등급 : ${grade.getGrade() }<br>

</body>
</html>