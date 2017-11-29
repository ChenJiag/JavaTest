package com.cjglib.usemybatis.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cjglib.usemybatis.dao.StudentDaoImpl;
import com.cjglib.usemybatis.entities.Student;
import com.cjglib.usemybatis.mapping.StudentDao;

public class TestStudentDaoImpl {
	static StudentDao studentDao;

	@BeforeClass
	public static void beforeClass() {
		studentDao = new StudentDaoImpl();
	}

	@Test
	public void testGetAllStudent() {
		List<Student> students = studentDao.getAllStudent();
		for (Student student : students) {
			System.out.println(student);
		}
		assertNotNull(students);

	}
}
