package com.ronny.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ronny.dao.StudentDao;
import com.ronny.entity.Student;

@Service
public class StudentServices {
	
	@Autowired
	StudentDao studentdao;

	public void addStudent(Student student) {
		studentdao.addStudent(student);
	}
	
	@Autowired
	StudentDao studentDao2;
	public List<Student> getAllStudents() {
		List<Student> list = studentDao2.getAllStudents();
		return list;
	}



}
