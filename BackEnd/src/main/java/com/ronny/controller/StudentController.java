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
	public void addStudent(@RequestBody Student student) {
		studentServices.addStudent(student);
	}
	
	
	@GetMapping("getAllStudents")
	public List<Student> getAllStudents() {
		List<Student> allStudents = studentServices.getAllStudents();
		return allStudents;
	}
	@PostMapping("addMultipleStudents")
	public List<Student> addMultipleStudents(List<Student> list){
		 studentServices.addMultipleStudents(list);
		 return list;
	}


}
