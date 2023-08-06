package com.masai.Exception;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

public class GlobelExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(invalidArgumentException.class)
	public ResponseEntity<MyErrorDetails> ExceptionHandler(invalidArgumentException ce,WebRequest req){
	MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ce.getMessage());
		err.setDetails(req.getDescription(false));
	
		return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	}
	
	
	@org.springframework.web.bind.annotation.ExceptionHandler(OrderNotFoundException.class)
	public ResponseEntity<MyErrorDetails> ExceptionHandler(OrderNotFoundException ne,WebRequest req){
	MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ne.getMessage());
		err.setDetails(req.getDescription(false));
	
		return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	}
	
	
	@org.springframework.web.bind.annotation.ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<MyErrorDetails> ExceptionHandler2(UserNotFoundException e,WebRequest req){
	MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(e.getMessage());
		err.setDetails(req.getDescription(false));
	
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	}
	
		
	
		
		@ExceptionHandler(MethodArgumentNotValidException.class)
		public ResponseEntity<MyErrorDetails> myMANVExceptionHandler(MethodArgumentNotValidException me)  {
			MyErrorDetails err = new MyErrorDetails();
			err.setTimestamp(LocalDateTime.now());
			err.setMessage("Validation Error");
			err.setDetails(me.getBindingResult().getFieldError().getDefaultMessage());
			
			return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
				
		}
	
}
