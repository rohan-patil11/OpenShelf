package com.ronny.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ronny.entity.Teacher;

@Repository
public class TeacherDao {
	
	@Autowired
	SessionFactory factory;
	
	public List<Teacher> getAllTeachers(){
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Teacher.class);
		List<Teacher> list = criteria.list();
		return list;
	}
	
	public void addTeacher(Teacher teacher) {
		Session session = factory.openSession();
		session.save(teacher);
		session.beginTransaction().commit();
	}

	
	public void deleteTeacher(int teacherId) {
		Session session = factory.openSession();
		Teacher teacher = session.get(Teacher.class, teacherId);
		session.delete(teacher);
		session.beginTransaction().commit();	
	}


}
