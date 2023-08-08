package com.masai.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/masai")
public class Welcome {

	@GetMapping("/welcome")
	public ResponseEntity<String>welcome(){
		return new ResponseEntity<String>("welcome to mypage",HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/welcomep")
	public ResponseEntity<String>welcomep(){
		return new ResponseEntity<String>("welcom",HttpStatus.ACCEPTED);
	}
}
