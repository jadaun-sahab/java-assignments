package com.masai.servce;

import java.util.List;

import com.masai.exception.StudentException;
import com.masai.model.Student;


public interface StudentService {

	
	public Student saveStudent(Student student);
	
	public Student getStudentByRoll(Integer roll)throws StudentException;
	
	public List<Student> getAllStudentDetails()throws StudentException;
	
	public Student deleteStudentByRollNo(Integer roll) throws StudentException;
	
}
