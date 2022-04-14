<%@page import="com.liz.vo.BoardVO"%>
<%@page import="com.liz.dao.BoardDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.util.Date"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js">
<title>게시판 목록</title>
</head>
<body>
<%-- <%
BoardDAO boardDAO = new BoardDAO();
	ArrayList<BoardVO> boardList = boardDAO.boardList();
	
	for(int i=0;i<boardList.size();i++){
		BoardVO board = boardList.get(i);
		int boardNo = board.getBoard_no();
		String category = board.getCategory();
		String user_name = board.getUser_name();
		String title = board.getTitle();
		String content = board.getContent();
		Date create_date = board.getCreate_date();
		Date modify_Date = board.getModify_date();
		
		out.println(category);
		out.println(user_name);
		out.println(title);
		out.println(content);
		out.println(create_date);
		out.println(modify_Date);
	}
%> --%>
	<div class="container mt-3">
		<h2>게시판 - 목록</h2>
		<div id=searchDate>
			<input type="text" id="datePicker" class="form-control"
				value="2022-04-13" width="400px">
		</div>

		<div id=searchForm>
			<input class="form-control" id="myInput" type="text"
				placeholder="검색어를 입력해 주세요 (제목+작성자+내용)"> <br>
		</div>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>카테고리</th>
					<th>제목</th>
					<th>작성자</th>
					<!-- <th>조회수</th> -->
					<th>등록 일시</th>
					<th>수정 일시</th>
				</tr>
			</thead>
			<tbody id="myTable">
				<tr>
					<td>${boardList.getCategory}</td>
					<td>${boardList.getTitle}</td>
					<td>${boardList.getUsername}</td>
					<%-- <td>${boardList.getViewCount}</td> --%>
					<td>${boardList.getCreateDate}</td>
					<td>${boardList.getModifyDate}</td>
				</tr>
			</tbody>
		</table>


	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>