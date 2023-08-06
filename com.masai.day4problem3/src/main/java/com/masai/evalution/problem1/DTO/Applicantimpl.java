package com.masai.evalution.problem1.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Applicantimpl implements Applicant {
	
	@Id
	
	    int id;
	    String email;
		String address;
		String mobNo;
		String category;
		int experience;
		
		public Applicantimpl() {
			super();
		}

		public Applicantimpl(int id, String email, String address, String mobNo, String category, int experience) {
			this.id = id;
			this.email = email;
			this.address = address;
			this.mobNo = mobNo;
			this.category = category;
			this.experience = experience;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
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

		public String getMobNo() {
			return mobNo;
		}

		public void setMobNo(String mobNo) {
			this.mobNo = mobNo;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public int getExperience() {
			return experience;
		}

		public void setExperience(int experience) {
			this.experience = experience;
		}

		@Override
		public String toString() {
			return "id=" + id + ", email=" + email + ", address=" + address + ", mobNo=" + mobNo
					+ ", category=" + category + ", experience=" + experience ;
		}
		
		
}