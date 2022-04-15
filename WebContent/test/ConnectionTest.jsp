<%@page import="com.liz.config.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연결 테스트</title>
</head>
<body>
	<%-- <%
	Connection conn = DBConnection.getDataSource();
	%>
	<h1>Connection Test</h1>
	<p>
		<%=conn%>
	</p>
	<%
	conn.close();
	%> --%>
</body>
</html>