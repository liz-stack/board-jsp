<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="SignUp.jsp" method="get">
		name : <input type="text" name="m_name"><br>
		password : <input type="password" name="m_password"><br>
		hobby : sport<input type="checkbox" name="m_hobby" value="sport">, 
			cooking<input type="checkbox" name="m_hobby" value="cooking">,
			reading<input type="checkbox" name="m_hobby" value="reading"><br>
			<input type="submit" value="sign up">
	</form>
</body>
</html>