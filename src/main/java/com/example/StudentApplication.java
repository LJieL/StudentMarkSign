package com.example;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.service.StudentService;

@SpringBootApplication
public class StudentApplication {
	@Autowired
	private StudentService studentService;
	
	public void setStudentService(StudentService studentService) {
		new StudentApplication();
	}
	@Bean
	public void test() {
		Scanner scan = new Scanner(System.in);
		List<Student> newStudent = studentService.newStudent();
		while (true) {
			System.out.println("输入数字1:查看所有学生信息");
			System.out.println("输入数字3:进行签到");
			System.out.println("输入数字2:查看签到的学生人数");
			System.out.println("输入数字4:退出系统！");
			System.out.println("请输入你要进行的操作:");
			int num = scan.nextInt();
			switch (num) {
			case 1:
				for (Student student : newStudent) {
					System.out.println(student);
				}
				break;
			case 2:
				System.out.println("请输入学生姓名:");
				String name = scan.next();
				studentService.markSign(newStudent, name);
				break;
			case 3:
				int num1 =studentService.checkSignNum(newStudent);
				System.out.println(num1);
				break;
			case 4:
				System.out.println("退出系统，欢迎下次使用！");
				break;

		}
	}
	}
}
