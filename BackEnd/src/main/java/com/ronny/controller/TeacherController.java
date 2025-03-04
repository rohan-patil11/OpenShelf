package com.ronny.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ronny.entity.Teacher;
import com.ronny.services.TeacherServices;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TeacherController {
	
	@Autowired
	TeacherServices teacherServices;
	
	@GetMapping("getAllTeachers")
	public List<Teacher> getAllTeachers(){
		List<Teacher> allTeachers = teacherServices.getAllTeachers();
		return allTeachers;
	}
	

	@PostMapping("addTeacher")
	public void addTeacher(@RequestBody Teacher teacher) {
		teacherServices.addTeacher(teacher);
	}
	
	@DeleteMapping("deleteTeacher/{teacherId}")
	public void deleteTeacher(@PathVariable int teacherId) {
		teacherServices.deleteTeacher(teacherId);
	}



}
