package com.liz.config;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConnection {
		// mybatisConfig.xml에 작성한 Context를 읽어와서 DataSource 객체를 획득해
		//Connection을 반환하는 메서드를 정의
		private static DataSource dataSource;
		static {
			// mybatisConfig.xml에 Resource 객체를 통해서 DataSource를 읽어들이기 위한 객체
			try {
				InitialContext context = new InitialContext();
				dataSource = (DataSource) context.lookup("java:com/liz/config/mybatisConfig.xml");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static Connection getDataSource() throws SQLException {
			return dataSource.getConnection();
		}
}
