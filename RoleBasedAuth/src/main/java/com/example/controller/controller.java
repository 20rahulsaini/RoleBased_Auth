package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.entities.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/home")
public class controller {

	@Autowired
	public UserService userService;

	@GetMapping("/public")
	public String getuser() {
		return "Public user ";
	}
	
	
	@GetMapping("/user-details")
	public  List<User> getuserDetails() {
		return userService.singleuser();
	}
	
	@GetMapping("/admin-details")
	public  List<User> getAdminDetails() {
		return userService.getAlluser();
	}
	
	
	
}
