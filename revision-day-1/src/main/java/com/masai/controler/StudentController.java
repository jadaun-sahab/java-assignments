package com.masai.controler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.masai.model.Student;
import jakarta.validation.Valid;



@RestController
	public class StudentController {
		private Map<Integer,Student> map = new HashMap<>();
		   //for getting the students details
		 @PostMapping("/students")
		   public ResponseEntity<String> SaveStudent(@Valid @RequestBody Student student) {
			 
			 map.put(student.getRoll(), student);
			   String res= "student added succfully"+student;
			   return new ResponseEntity<>(res,HttpStatus.CREATED);
	}
		 @GetMapping("/students")
			public List<Student>GetAllStudent(){
				Collection<Student>collection= map.values();
				List <Student>student=new ArrayList<>(collection);
				return student;
				
			}
	   
	  
	   //get student by roll no
	   @GetMapping("/students/{roll}")
	   public ResponseEntity<String> getStudentByRollnoHandler(@PathVariable Integer roll) {
		 if(map.containsKey(roll)) {
			 Student student=map.get(roll);
			 map.put(student.getRoll(), student);
			   String res= "student added succfully"+student;
			   return new ResponseEntity<>(res,HttpStatus.ACCEPTED);
			 
		 }else {
			  throw new IllegalArgumentException("student does  not exist with this roll no"+roll);
		 }
	   }
   
   
	   //update student by roll no
	   @PutMapping("/students/{roll}")
	   public String updateStudentByRollnoHandler(@PathVariable Integer roll,@RequestBody Student student) {
		 if(map.containsKey(roll)) {
			 Student existingStudent=map.get(roll);
			 existingStudent.setName(student.getName());
			 existingStudent.setAddress(student.getAddress());
			 existingStudent.setMarks(student.getMarks());
			  
			 map.put(roll, existingStudent);
			 return "student updated successfuly";
		 }else {
			  throw new IllegalArgumentException("student does  not exist with this roll no"+roll);
		 }
	  }
	   
	   
	 //http://localhost:8080/students/10?gmarks=50
   
	 //update student marks
	   @PatchMapping("/students/{roll}")
	   public String updateStudentmarks(@PathVariable Integer roll,@RequestParam Integer gmarks) {
		 if(map.containsKey(roll)) {
			 Student existingStudent=map.get(roll);
			 existingStudent.setMarks(existingStudent.getMarks()+gmarks);
			 map.put(roll, existingStudent);
			 return "student marks is graced by"+gmarks;
		 }else {
			  throw new IllegalArgumentException("student does  not exist with this roll no"+roll);
		 }
	   }
   
 
	 //delete student by roll no
	   @DeleteMapping("/students/{roll}")
	   public String deleteStudentmarks(@PathVariable Integer roll) {
		 if(map.containsKey(roll)) {
			 Student existingStudent=map.get(roll);
			 
			 map.remove(existingStudent);
	
			 return "student deleted successfully";
		 }else {
			  throw new IllegalArgumentException("student does  not exist with this roll no");
		 }
	  
	   }
		
		
}