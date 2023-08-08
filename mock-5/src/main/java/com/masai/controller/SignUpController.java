package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Service.UserService;
import com.masai.exception.UserException;
import com.masai.model.User;


@RestController
public class SignUpController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/signupUser")
	public ResponseEntity<User> saveUser(@RequestBody User user) throws UserException {
		
		User user1= userService.createUser(user);
		
		return new ResponseEntity<User>(user,HttpStatus.CREATED);
	}
}
