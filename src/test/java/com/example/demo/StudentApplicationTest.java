package com.example.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.Student;
import com.example.service.StudentService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootApplication
public class StudentApplicationTest {
	
	@Autowired
	private StudentService studentService;
	
	@Test
	public void contextLoads(){
		
	}
	
	@Test
	public void newStudent() {
		List<Student> student = studentService.newStudent();
		Assert.assertEquals(10, student.size());
	}
	@Test
	public void markSign() {
		List<Student> student = studentService.newStudent();
		studentService.markSign(student, "学生6");
		Assert.assertEquals(true, student.get(6).isSign());
	}
	
	@Test
	public void checkSignNum() {
		List<Student> student = studentService.newStudent();
		studentService.markSign(student, "学生8");
		int countSign = studentService.checkSignNum(student);
		Assert.assertEquals(1, countSign);
	}
}
