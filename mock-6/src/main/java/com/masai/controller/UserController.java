package com.masai.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.masai.exception.UserException;
import com.masai.model.User;
import com.masai.Service.UserService;



@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/createUser")
	public ResponseEntity<User> saveCustomer(@RequestBody User customer) throws UserException {
		
		
		
		
		User savedCustomer= userService.createCustomer(customer);
		
		return new ResponseEntity<User>(savedCustomer,HttpStatus.CREATED);
	}
	

	@PostMapping("/login/{email}/{password}")
	public ResponseEntity<User> logInCustomer(@RequestParam String email,@RequestParam String password) throws UserException {

		User user = userService.loginUser(email,password);

		return new ResponseEntity<User>(user, HttpStatus.OK);

	}

}
