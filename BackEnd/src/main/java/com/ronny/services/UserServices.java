package com.ronny.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ronny.dao.UserDao;
import com.ronny.entity.User;
import com.ronny.model.LogInRequest;

@Service
public class UserServices {
	
	@Autowired
	UserDao userDao;
	
	public User LogIn(LogInRequest login) {
		return userDao.LogIn(login);
	}
	
	public List<User> getAllUsers(){
		List<User> allUsers = userDao.getAllUsers();
		return allUsers;
	}
	
	public User addUser(User user) {
		User user2 = userDao.addUser(user);
		return user2;
	}
}
