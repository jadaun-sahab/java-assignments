package com.masai.day4.problem3.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Lawyer {

	@Id
		int id; 
		String name;
		String email;
		String address;
		int experience;
		
		public Lawyer() {
			super();
		}

		public Lawyer(int id, String name, String email, String address, int experience) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.address = address;
			this.experience = experience;
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

		public int getExperience() {
			return experience;
		}

		public void setExperience(int experience) {
			this.experience = experience;
		}

		@Override
		public String toString() {
			return "id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", experience="
					+ experience ;
		}
	
		
}
