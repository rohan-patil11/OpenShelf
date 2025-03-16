package com.ronny.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ronny.dao.StudentDao;
import com.ronny.entity.Student;

@Service
public class StudentServices {
	
	@Autowired
	StudentDao studentDao;

	public Student addStudent(Student student) {
		 Student student2 = studentDao.addStudent(student);
		 return student2;
	}
	

	public List<Student> getAllStudents() {
		List<Student> list = studentDao.getAllStudents();
		return list;
	}


	public List<Student> addMultipleStudents(List<Student> list) {
		studentDao.addMultipleStudents(list);
		return list;
	}



}
