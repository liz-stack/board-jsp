package com.liz.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConn() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/board_jsp?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
			conn = DriverManager.getConnection(url, "root", "1234"); // db 로그인 정보로 연동
			return conn;
		} catch (ClassNotFoundException ce) {
			System.out.println(ce.getMessage());
		}
		return null;
	}
}
