package com.masai.day4.DAO;

import java.util.Scanner;
import com.masai.day4.utility.EMUtil;
import com.masai.day4entites.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;


public class EmployeeDaoimpl implements EmployeeDao{
	public void save(Employee emp) {
		EntityManager em = EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(emp);
	
		Employee eployee = new Employee(6,"himu", "shivpuri",60000);
	       EntityTransaction et = em.getTransaction();
	       et.begin();
	       em.persist(eployee);
	       et.commit();
	       System.out.println("successfull");
	       em.close();
	}

	public String getAddressOfEmployee(int empId) {
		EntityManager em = EMUtil.provideEntityManager();
		Employee emplo = em.find(Employee.class, empId);
		String getAddress = null;
		if(emplo !=null) {
		em.getTransaction().begin();
		getAddress=emplo.getAddress();
		em.getTransaction().commit();
		}
		else {
			System.out.println("Employee deos not exist");
		}
		em.close();
		return getAddress;
	}

	public String giveBonusToEmployee(int empId, int bonus) {
		EntityManager em = EMUtil.provideEntityManager();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee id to update the salary");
		int amount=sc.nextInt();
		Employee eployee = em.find(Employee.class,amount);
		 if(eployee ==null) {
			 System.out.println("Employee deos not exist");
		 }
		 else {
			 System.out.println("enter the amount");
			 int Amount=sc.nextInt();
			 em.getTransaction().begin();
			 eployee.setSalary(eployee.getSalary()+Amount);
			 em.getTransaction().commit();
			 System.out.println("bonus granted");
			 em.close();
		 }
		return null;
	}

	public boolean deleteEmployee(int empId) {
		boolean flag =false;
		EntityManager em = EMUtil.provideEntityManager();
		Employee emplo = em.find(Employee.class, empId);
		if(emplo !=null) {
		em.getTransaction().begin();
		em.remove(emplo);
		flag=true;
		em.getTransaction().commit();
		}
		em.close();
		return flag;
	}

	public Object save(EmployeeDaoimpl em) {
		// TODO Auto-generated method stub
		return null;
	}

}
