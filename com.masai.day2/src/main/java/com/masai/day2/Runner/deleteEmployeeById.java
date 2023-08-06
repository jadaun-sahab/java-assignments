package com.masai.day2.Runner;

import java.util.Scanner;
import com.masai.day2entites.Eployee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class deleteEmployeeById {
	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("product-unit");
		EntityManager em =emf.createEntityManager();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter employee id to delete");
		int id=sc.nextInt();
		Eployee eployee = em.find(Eployee.class,id);
		 if(eployee !=null) {
			 em.getTransaction().begin();
			 em.remove(eployee);
			 em.getTransaction().commit();
			 System.out.println("Employee removed successfully");
		 }
		 else {
			 System.out.println("Employee not removed ");
			 em.close();
			 System.out.println("completeed");
		 }
}
}