package com.masai.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobelExceptionHandler {

	
	
	@ExceptionHandler(invalidNumbetrExcepstion.class)
	public ResponseEntity<String> exceptionHandler(invalidNumbetrExcepstion ae){
		return new ResponseEntity<>(ae.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	
}
