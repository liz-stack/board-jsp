package com.liz.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.liz.vo.BoardVO;

public class BoardDAO {
	Logger log = LogManager.getLogger(BoardDAO.class);

	private SqlSession sqlSession;

	public BoardDAO() {
		String resource = "com/liz/config/mybatisConfig.xml";
		InputStream inputStream = null;

		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

			sqlSession = sqlSessionFactory.openSession(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (inputStream != null)
				try {
					inputStream.close();
				} catch (IOException e) {
				}
			

		}
	}

	public ArrayList<BoardVO> boardList() {
		ArrayList<BoardVO> boardList = (ArrayList) sqlSession.selectList("list");
		log.error(boardList);
		if (sqlSession != null)
			sqlSession.close();

		return boardList;
	}

	/*
	 * public BoardDAO() throws IOException { String resource =
	 * "com/liz/config/mybatisConfig.xml"; InputStream inputStream =
	 * Resources.getResourceAsStream(resource); SqlSessionFactory sqlSessionFactory
	 * = new SqlSessionFactoryBuilder().build(inputStream); SqlSession session =
	 * sqlSessionFactory.openSession();
	 * 
	 * }
	 * 
	 * // 게시판 목록
	 * 
	 * @Test public List<BoardVO> boardList() { try { List<BoardVO> boardLists =
	 * (ArrayList) sqlSession.selectList("boardList"); log.error(boardLists); }
	 * catch (Exception e) { e.printStackTrace(); } return boardList(); }
	 */

	/*
	 * while(rs.next()) { //int boardNo = rs.getInt("boardNo"); String category =
	 * rs.getString("category"); String user_name = rs.getString("user_name"); //int
	 * userNo = rs.getInt("userNo"); String password = rs.getString("password");
	 * String title = rs.getString("title"); String content =
	 * rs.getString("content"); Date create_date = rs.getDate("create_date"); Date
	 * modify_date = rs.getDate("modify_date");
	 */

	/*
	 * int boardNo, userNo; String category, userName, password, title,content; Date
	 * createDate, modifyDate;
	 */

	/*
	 * ArrayList<BoardVO> boardList = null; BoardVO vo = null;
	 * 
	 * String sql =
	 * "SELECT boardNo, category, userName, userNo, password, title, content, createDate, modifyDate FROM BOARD.BOARD_JSP"
	 * ;
	 * 
	 * try { conn = DriverManager.getConnection(url, dbId, dbPassword); pstmt =
	 * conn.prepareStatement(sql); rs = pstmt.executeQuery();
	 * 
	 * while (rs.next()) { vo = new BoardVO(rs.getInt("boarNo"),
	 * rs.getString("category"), rs.getString("userName"), rs.getInt("userNo"),
	 * rs.getString("password"), rs.getString("title"), rs.getString("content"),
	 * rs.getDate("2022-04-13"), rs.getDate("null")); boardList.add(vo);
	 * System.out.println(vo); System.out.println(boardList); } rs.close();
	 * pstmt.close(); conn.close(); } catch (Exception e) { e.printStackTrace(); }
	 * //request.setAttribute("boardList", boardList); System.out.println(vo);
	 * System.out.println(boardList);
	 * 
	 * //forward
	 * 
	 * 
	 * }catch(SQLException se){ System.out.println(se.getMessage()); }finally{ try{
	 * if(rs!=null) { rs.close(); }if(pstmt!=null){ pstmt.close(); }if(conn!= null){
	 * conn.close(); } } catch(SQLException se){ System.out.prntln(se.getMessage());
	 * } }
	 */

}// doget

/*
 * public BoardDAO() throws ClassNotFoundException {
 * Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버 로딩 }
 * 
 * public void closeAll(PreparedStatement ptmt, Connection conn) throws
 * SQLException { if (ptmt != null) ptmt.close(); if (conn != null)
 * conn.close(); }
 */
