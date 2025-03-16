package com.ronny.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ronny.entity.User;
import com.ronny.model.LogInRequest;

@Repository
public class UserDao {
	@Autowired
	SessionFactory factory;

	public User LogIn(LogInRequest login) {
		Session session = factory.openSession();
		User user = session.get(User.class, login.getUsername());
		if (login.getUsername().equals(user.getUsername()) && login.getPassword().equals(user.getPassword())) {
			return user;
		} else {
			return null;
		}
	}

	public List<User> getAllUsers() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		List<User> list = criteria.list();
		return list;
	}

	public User addUser(User user) {
		Session session = factory.openSession();
		session.save(user);
		session.beginTransaction().commit();
		return user;
		
	}

}
