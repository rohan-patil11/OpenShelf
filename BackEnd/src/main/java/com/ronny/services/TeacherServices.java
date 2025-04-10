package com.ronny.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ronny.dao.TeacherDao;
import com.ronny.entity.Teacher;

@Service
public class TeacherServices {
	
	@Autowired
	TeacherDao teacherDao;
	
	public List<Teacher> getAllTeachers(){
		List<Teacher> allTeachers = teacherDao.getAllTeachers();
		return allTeachers;
	}

	public Teacher addTeacher(Teacher teacher) {
		Teacher teacher2 = teacherDao.addTeacher(teacher);
		return teacher2;
	}
	
	public void deleteTeacher(int teacherId) {
		teacherDao.deleteTeacher(teacherId);
	}



}
