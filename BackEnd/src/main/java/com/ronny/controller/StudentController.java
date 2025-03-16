package com.ronny.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ronny.entity.Student;
import com.ronny.services.StudentServices;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {
	
	@Autowired
	StudentServices studentServices;
	
	@PostMapping("addStudent")
	public Student addStudent(@RequestBody Student student) {
		Student student2 = studentServices.addStudent(student);
		return student2;
	}
	
	
	@GetMapping("getAllStudents")
	public List<Student> getAllStudents() {
		List<Student> allStudents = studentServices.getAllStudents();
		System.out.println(allStudents);
		return allStudents;
	}
	@PostMapping("addMultipleStudents")
	public List<Student> addMultipleStudents(List<Student> list){
		 studentServices.addMultipleStudents(list);
		 return list;
	}


}
