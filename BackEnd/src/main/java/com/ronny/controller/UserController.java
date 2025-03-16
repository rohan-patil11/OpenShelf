package com.ronny.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ronny.entity.User;
import com.ronny.model.LogInRequest;
import com.ronny.services.UserServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	UserServices userServices;
	
	@PostMapping("LogIn")
	public User LogIn(@RequestBody LogInRequest login) {
		return userServices.LogIn(login);
	}
	
	@GetMapping("getAllUsers")
	public List<User> getAllUsers(){
		List<User> allUsers = userServices.getAllUsers();
		return allUsers;
	}
	
	@PostMapping("addUser")
	public User addUser(@RequestBody User user) {
		User user2 = userServices.addUser(user);
		return user2;
	}
	
}
