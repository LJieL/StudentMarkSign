package com.example.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.startsWith;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.Student;

@RunWith(SpringRunner.class)
@SpringBootApplication
public class StudentServiceTest {
	@Autowired
	private StudentService studentService;
	@Test
	public void newStudent() {
		List<Student> stu = studentService.newStudent();
		for (Student student : stu) {
			System.out.println(student);
		}
	}
	@Test
	public void markSign() {
		List<Student> stu = studentService.newStudent();
		studentService.markSign(stu, "学生5");
		for (Student student : stu) {
			System.out.println(student);
		}
		
	}
	@Test
	public void checkSignNum() {
		List<Student> stu = studentService.newStudent();
		studentService.markSign(stu, "学生5");
		int countSign =studentService.checkSignNum(stu);
		assertEquals(countSign, 1);
	}
}
