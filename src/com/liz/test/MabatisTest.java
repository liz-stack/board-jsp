package com.liz.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.liz.vo.BoardVO;

public class MabatisTest {

	@Test
	public void gettingStarted() throws Exception {
		String resource = "com/liz/config/mybatisConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();

		try {
			BoardVO boardVO = session.selectOne("findByBoardNo", 1);
			// Blog blog = session.selectOne("org.mybatis.example.BlogMapper.selectBlog",
		} finally {
			session.close();
		}
	}
}
