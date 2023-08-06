package com.masai.day2entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Eployee {
	
	@Id
		int empId;
		String name;
		String address;
		int salary;
		
		public Eployee() {
			super();
		}

		public Eployee(int empId, String name, String address, int salary) {
			super();
			this.empId = empId;
			this.name = name;
			this.address = address;
			this.salary = salary;
		}

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
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

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "empId=" + empId + ", name=" + name + ", address=" + address + ", salary=" + salary ;
		}
}
