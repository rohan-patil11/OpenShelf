package com.ronny.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ronny.entity.Student;

@Repository
public class StudentDao {
	
	@Autowired
	SessionFactory factory;
	public void addStudent(Student student) {
		
		Session session = factory.openSession();
		session.save(student);
		session.beginTransaction().commit();
	}
	
	
	public List<Student> getAllStudents() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		List<Student> list = criteria.list();
		return list;	
	}
}
