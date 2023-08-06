package com.masai.day2.Runner;

import java.util.Scanner;
import com.masai.day2entites.Eployee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class getEmployeeById {
public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("product-unit");
		EntityManager em =emf.createEntityManager();
		

		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter employee id to search : ");
	    int id = sc.nextInt();
	    Eployee eployee = em.find(Eployee.class,id);
	    System.out.println(eployee.toString());
	}
}