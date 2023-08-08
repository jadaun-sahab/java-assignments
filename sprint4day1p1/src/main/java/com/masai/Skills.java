package com.masai;

public class Skills {

	
	private int id ;
	private String name; 
	private int yearsOfExperience;
	public Skills() {
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
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	@Override
	public String toString() {
		return "Skills [id=" + id + ", name=" + name + ", yearsOfExperience=" + yearsOfExperience + "]";
	} 

	
}
