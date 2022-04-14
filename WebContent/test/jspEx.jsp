<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp test</title>
</head>
<body>

	<%-- 선언 태그 c.f. jsp주석태그는 컴파일 대상이 아님 --%>
	<%!int num = 10;
		String str = "jsp";
		/* ArrayList list = new ArrayList<String>(); */
		
		public void jspMethod(){
			System.out.println("메소드 생성 확인");
		}
	%>

	<!-- 스크립트릿 태그-->
	<%
		if(num >0){
	%>
		<p>num>0</p>
	<% 
		}else{
	%>
		<!-- <p>num<=0 </p> -->
	<%
		}
	%>
	
	<!-- 표현식 -->
	num is <%= num%>
	
	<!-- 지시어 -->
	<%-- <%@ include file="header.jsp"  %> --%>
	
</body>
</html>