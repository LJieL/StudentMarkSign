package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Student;

@Service
public class StudentService {
	//创建学生对象
	public List<Student> newStudent(){
		int count =10;
		List<Student> stu = new ArrayList();
		for (int i = 0; i < count; i++) {
			
			Student s = new Student("学生"+i,i,false);
			stu.add(s);
		}
	
		return stu;
		
	}
	//学生签到
	public static void markSign(List<Student> list,String name) {
		int  l =list.size();
		for (int i = 0; i < l; i++) {
//			int random = (int) (Math.random()%2);
			if (name.equals(list.get(i).getName())) {
				list.get(i).setSign(true);
				System.out.println("学生"+i+"签到成功~！");
			}
		}
	}
	//统计签到人数
	public static int checkSignNum(List<Student> list) {
		int count =0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).isSign()) {
				count++;
			}
		}
		return count;
		
	}

}
