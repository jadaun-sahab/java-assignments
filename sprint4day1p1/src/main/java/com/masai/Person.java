package com.masai;

public class Person {

	
	private int id ;
	private String name; 
	private int age;
	private String email; 
	private String mobile;
	
	
	
	public Person() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", mobile=" + mobile + "]";
	}
	public Person(int id, String name, int age, String email, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.mobile = mobile;
	}
	
	
}
