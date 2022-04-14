package com.liz.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;

@WebServlet("/db")
public class DBTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DBTest() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//response.getWriter().append(request.getContextPath());
		response.setContentType("text/html;charse=UTF-8");

		Connection conn = null; //db에 연동할 객체 생성
		Statement stmt = null; //sql문을 db에 보내기 위한 객체
		Resultset rs = null; //sql 질의에 의해 생성된 테이블을 저장

		String sql ="select * from board_jsp";

		try { // 드라이버 로딩 예외 처리
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException :" + e.getMessage());
		}

		try { // 드라이버 클래스 이용해 커넥션 객체에 localhost:3306/DB 와 연동 및 예외처리
			String url = "jdbc:mysql://localhost:3306/board_jsp?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";

			conn = DriverManager.getConnection(url, "root", "1234"); // db 로그인 정보로 연동
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
			System.out.println("VendorError: " + e.getErrorCode());
		} finally {
			response.getWriter().append(conn.toString() + "<br/>");
			response.getWriter().append("localhost:3306/board_jsp (DB Connection Success!)");

			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace(); // System.err 출력
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
