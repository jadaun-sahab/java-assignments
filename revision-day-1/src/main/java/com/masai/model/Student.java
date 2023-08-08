package com.masai.model;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;


public class Student {

	
	@Min(value=10, message="{roll.invalid}")
	private Integer roll;

	@NotNull( message="name is mandotary")
	@Size(min=3,max=15,message="{name.invalid}")
	private String name;

	@NotNull( message="address is mandotary")
	@NotBlank(message="should not be blank")
	@NotEmpty(message ="address should not be empty")
	private String address;
	private Integer marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(Integer roll, String name, String address, Integer marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	
	
	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}

	
	
}
