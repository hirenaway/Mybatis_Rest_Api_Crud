package com.mbcrud.mbcruddemo.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DbSession {

	private static SqlSessionFactory factory;

	private DbSession() {
	}

	static {
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
		} catch (IOException e) {
			throw new RuntimeException("Error");
		}
			factory = new SqlSessionFactoryBuilder().build(reader);
		}

		public static SqlSessionFactory getSqlSessionFactory() {
			return factory;
		}

}