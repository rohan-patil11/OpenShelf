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
	SessionFactory factory1;
	public void addStudent(Student student) {
		
		Session session = factory1.openSession();
		session.save(student);
		session.beginTransaction().commit();
	}
	
	@Autowired
	SessionFactory factory2;
	public List<Student> getAllStudents() {
		Session session = factory2.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		List<Student> list = criteria.list();
		return list;	
	}
}
