package com.masai.day2.Runner;

import java.util.Scanner;
import com.masai.day2entites.Eployee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class updateEmployeeSalary {
	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("product-unit");
		EntityManager em =emf.createEntityManager();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee id to update the salary");
		int amount=sc.nextInt();
		Eployee eployee = em.find(Eployee.class,amount);
		 if(eployee ==null) {
			 System.out.println("Employee deos not exist");
		 }
		 else {
			 System.out.println("enter the amount");
			 int Amount=sc.nextInt();
			 em.getTransaction().begin();
			 eployee.setSalary(eployee.getSalary()+Amount);
			 em.getTransaction().commit();
			 System.out.println("salary increaseed");
			 em.close();
		 }
	}
}
