<%@page import="com.liz.vo.BoardVO"%>
<%@page import="com.liz.dao.BoardDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.util.Date"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/board.css">

<!-- jQuery import -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

<title>게시판 목록</title>
</head>
<body>
	<%-- <%
	//list.jsp에서 선택한 링크를 통해 get 방식으로 전송 되어온 파라미터 값
	
	
	BoardDAO dao = new BoardDAO();
	BoardVO vo = new BoardVO();
	ArrayList<BoardVO> boardList = dao.boardList();


	for (int i = 0; i < boardList.size(); i++) {
		BoardVO board = boardList.get(i);
		int boardNo = board.getBoardNo();
		String category = board.getCategory();
		String userName = board.getUserName();
		String title = board.getTitle();
		String content = board.getContent();
		Date createDate = board.getCreateDate();
		Date modifyDate = board.getModifyDate();

		/* out.println(category);
		out.println(userName);
		out.println(title);
		out.println(content);
		out.println(createDate);
		out.println(modifyDate); */
	}
	%> --%>
	<div class="container mt-3">
		<br />
		<h2>게시판 - 목록</h2>
		<br />



		<div class="input-group mb-3 form-row">
			<div>
				<span class="이미지아이콘넣을곳"></span> <input type="text" id="startDate" class="form-control" autocomplete="off" value="시작일">
			</div>
			<div>
				<span class="이미지아이콘넣을곳"></span> <input type="text" id="endDate" class="form-control" autocomplete="off" value="종료일">
			</div>
			<div class="input-group-prepend">
				<button class="btn btn-outline-secondary dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">카테고리</button>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="#">Action</a> <a class="dropdown-item" href="#">Another action</a> <a class="dropdown-item" href="#">Something
						else here</a>
					<div role="separator" class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Separated link</a>
				</div>
			</div>
			<input type="text" class="form-control" aria-label="Text input with dropdown button">
			<button type="submit" class="btn btn-primary">검색</button>

		</div>
		<br />



		<table class="table table-hover">
			<thead>
				<tr>
					<th>카테고리</th>
					<th>제목</th>
					<th>작성자</th>
					<th>조회수</th>
					<th>등록 일시</th>
					<th>수정 일시</th>
				</tr>
			</thead>
			<tbody id="myTable">
				<tr>
					<td>${boardList.getCategory}</td>
					<td>${boardList.getTitle}</td>
					<td>${boardList.getUserName}</td>
					<td>${boardList.getViewCount}</td>
					<td>${boardList.getCreateDate}</td>
					<td>${boardList.getModifyDate}</td>
				</tr>
			</tbody>
		</table>

		<!-- 페이징  -->
		<nav aria-label="Page navigation example">
			<ul class="pagination" style="justify-content: center">
				<li class="page-item"><a class="page-link" href="#" aria-label="Previous"> <span aria-hidden="true">&laquo;</span> <span class="sr-only">Previous</span>
				</a></li>
				<li class="page-item"><a class="page-link" href="#">1</a></li>
				<li class="page-item"><a class="page-link" href="#">2</a></li>
				<li class="page-item"><a class="page-link" href="#">3</a></li>
				<li class="page-item"><a class="page-link" href="#">4</a></li>
				<li class="page-item"><a class="page-link" href="#">5</a></li>
				<li class="page-item"><a class="page-link" href="#">6</a></li>
				<li class="page-item"><a class="page-link" href="#">7</a></li>
				<li class="page-item"><a class="page-link" href="#">8</a></li>
				<li class="page-item"><a class="page-link" href="#">9</a></li>
				<li class="page-item"><a class="page-link" href="#">10</a></li>
				<li class="page-item"><a class="page-link" href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span> <span class="sr-only">Next</span>
				</a></li>
			</ul>
		</nav>


	</div>


</body>
</html>