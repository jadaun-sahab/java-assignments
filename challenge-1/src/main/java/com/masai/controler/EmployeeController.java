package com.masai.controler;

import java.util.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.masai.model.Employee;
import jakarta.annotation.PostConstruct;



@RestController
public class EmployeeController {

   private Map<Integer,Employee> map = new HashMap<>();
	
	   @PostConstruct
	   public void init() {
		   
		   map.put(01,new Employee(01,"vikas","jadaun","vikas@gmail.com","Boss"));
			map.put(01,new Employee(01,"vikas2","jadaun2","vikas2@gmail.com","manager"));
			map.put(01,new Employee(01,"vikas3","jadaun3","vikas3@gmail.com","j.Employee"));
			map.put(01,new Employee(01,"vikas4","jadaun4","vikas4@gmail.com","HR"));
			map.put(01,new Employee(01,"vikas5","jadaun5","vikas5@gmail.com","S.Employee"));
	
	   }
   
	   @RequestMapping("/emps")
		public List<Employee> getEmployee() {
			List<Employee> employee = new ArrayList();
			employee.add(01,new Employee(01,"vikas","jadaun","vikas@gmail.com","Boss"));
			employee.add(01,new Employee(01,"vikas2","jadaun2","vikas2@gmail.com","Manager"));
			employee.add(01,new Employee(01,"vikas3","jadaun3","vikas3@gmail.com","J.Employee"));
			employee.add(01,new Employee(01,"vikas4","jadaun4","vikas4@gmail.com","HR"));
			employee.add(01,new Employee(01,"vikas5","jadaun5","vikas5@gmail.com","S.Employee"));
			
			return employee;
		}
   
  
   
	 //for adding the employee
	   @PostMapping("/emps")
	   public String AddEmployee(@RequestBody Employee employee) {
		 map.put(employee.getId(), employee);
		   return "Employee added succfully"+employee;
	   }
	   
	   
	 //for getting the employee details
	   @GetMapping("/emps")
	   public List<Employee> getAllEmployee() {
		   Collection<Employee>collection = new ArrayList<>();
		   List<Employee>emp = new ArrayList<>();
		   for(Employee employee:collection) {
			   emp.add(employee);
		   }
		   return emp;
	   }
   
   
	   //get employee by id
	   @GetMapping("/emps/{id}")
	   public Employee getEmployeeByid(@PathVariable Integer id) {
		  if(map.containsKey(id)) {
			  Employee existingStudent=map.get(id);
			  
			  return existingStudent;
		  }
		  else {
			  throw new IllegalArgumentException("employee does not exist with this id"+id);
		  }
	   }
   
   
   
	 //update employee by id
	   @PutMapping("/emps/{id}")
	   public String updateEmployeeByid(@PathVariable Integer id,@RequestBody Employee employee) {
		 if(map.containsKey(id)) {
			 Employee existingemployee=map.get(id);
			 existingemployee.setFirstName(employee.getFirstName());
			 existingemployee.setLastName(employee.getLastName());
			 existingemployee.setEmail(employee.getEmail());
			 existingemployee.setPosition(employee.getPosition());
			  
			 map.put(id, existingemployee);
			 return "employee updated successfuly";
		 }else {
			  throw new IllegalArgumentException("employee does not exist with this id"+id);
		 }
	  }
	   
	   
	 //delete student by roll no
	   @DeleteMapping("/emps/{id}")
	   public String deleteEmployeeByid(@PathVariable Integer id) {
		 if(map.containsKey(id)) {
			 Employee employee=map.get(id);
			 
			 map.remove(employee);
	
			 return "Employee deleted successfully";
		 }else {
			  throw new IllegalArgumentException("Employee does  not exist with this id");
		 }
	  
	   }
   
}
