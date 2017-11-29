package com.cjglib.usemybatis.dao;

import java.io.InputStream;
import java.sql.Connection;

import javax.security.auth.login.Configuration;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.TransactionIsolationLevel;


public class MybatisUtil {
	private static SqlSessionFactory factory = null;

	public static SqlSessionFactory getSqlSessionFactory() {
		if (factory == null) {
			InputStream config = MybatisUtil.class.getClassLoader().getResourceAsStream("MyBatisCfg.xml");
			factory = new SqlSessionFactoryBuilder().build(config);
		}
		return factory;
	}
	
/* 
 *  创建连接接口
 */
	public static SqlSession getSession() {
		return getSqlSessionFactory().openSession(true);
	}

	public static SqlSession getSession(boolean isAutoCommit) {
		return getSqlSessionFactory().openSession(isAutoCommit);
	}

}
