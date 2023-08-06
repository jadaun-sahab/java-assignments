package com.masai.day2entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	int studentCode; 
	String email;
	String address;
	String course;
	int level;
	
	public Student() {
		super();
	}

	public Student(int studentCode, String email, String address, String course, int level) {
		super();
		this.studentCode = studentCode;
		this.email = email;
		this.address = address;
		this.course = course;
		this.level = level;
	}

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "studentCode=" + studentCode + ", email=" + email + ", address=" + address + ", course="
				+ course + ", level=" + level ;
	}
	
}
