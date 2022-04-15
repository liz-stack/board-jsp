<%@include file="../layout/header.jsp"%>

<%@page import="com.liz.vo.BoardVO"%>
<%@page import="com.liz.dao.BoardDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.util.Date"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
BoardDAO dao = new BoardDAO();

ArrayList<BoardVO> boardList = dao.boardList();
%>


<div class="container mt-3">
	<br />
	<h2>게시판 - 목록</h2>
	<br />



	<div class="input-group mb-3 form-row">
		<div>
			<input type="text" id="startDate" class="form-control" autocomplete="off" value="시작일">
		</div>
		<div>
			<input type="text" id="endDate" class="form-control" autocomplete="off" value="종료일">
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
			<%
			for (BoardVO b : boardList) {
			%>
		</thead>
		<tbody id="myTable">
			<tr>
				<td><%=b.getCategory()%></td>
				<td><a href="/board/detail=${b.boardNo}"><%=b.getTitle()%></a></td>
				<td><%=b.getUserName()%></td>
				<td><%=b.getViewCount()%></td>
				<td><%=b.getCreateDate()%></td>
				<td><%=b.getModifyDate()%></td>
			</tr>
			<%
			}
			%>
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

<%@include file="layout/footer.jsp"%>
	</body>
	</html>