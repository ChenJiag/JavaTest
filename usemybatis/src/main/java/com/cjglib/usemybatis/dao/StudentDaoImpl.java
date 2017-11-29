package com.cjglib.usemybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.cjglib.usemybatis.entities.Student;
import com.cjglib.usemybatis.mapping.StudentDao;

public class StudentDaoImpl implements StudentDao {

	public List<Student> getAllStudent() {
		SqlSession session = MybatisUtil.getSession();
		try {
			// ͨ��MyBatisʵ�ֽӿ�BookTypeDAO������ʵ��
			StudentDao studentDao = session.getMapper(StudentDao.class);
			return studentDao.getAllStudent();
		} finally {
			session.close();
		}
	}
}
