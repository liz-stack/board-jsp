package com.liz.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.liz.vo.BoardVO;

public class MybatisTest {
	Logger log = LogManager.getLogger(MybatisTest.class);

	private SqlSession sqlSession;

	public MybatisTest() {
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
	@Test
	public ArrayList<BoardVO> boardList() {
		ArrayList<BoardVO> boardList = (ArrayList) sqlSession.selectList("list");
		log.error(boardList);
		if (sqlSession != null)
			sqlSession.close();

		return boardList;
	}

	/*
	 * @Test public void gettingStarted() throws Exception { // ibatis의 Resources
	 * String resource = "com/liz/config/mybatisConfig.xml"; InputStream inputStream
	 * = Resources.getResourceAsStream(resource); // sqlSessionFactory 생성,
	 * DataSource를 참조하여 MyBatis와 Mysql 서버를 연동 SqlSessionFactory sqlSessionFactory =
	 * new SqlSessionFactoryBuilder().build(inputStream); SqlSession session =
	 * sqlSessionFactory.openSession();
	 * 
	 * try {
	 * 
	 * // mybatis가 제공하는 sql을 사용하려면, SqlSession이 필요 // SqlSessionFactory의 openSession
	 * method를 통해서, 얻어올 수 있다
	 * 
	 * List<BoardVO> boardList = session.selectList("BoardMapper.boardList");
	 * log.error(boardList);
	 * 
	 * } finally { session.close(); }
	 * 
	 */

}
