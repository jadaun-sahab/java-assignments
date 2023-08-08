package com.masai;

 public class Studends {
	 private int id;
	 private String name;
	 private String city;
	 
	public Employee(int id, String name, String city) {
		
		this.id = id;
		this.name = name;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	 
	 public int Compare(Employee e) {
		 return Integer.compare(this.id, e.id);
	 }
 }