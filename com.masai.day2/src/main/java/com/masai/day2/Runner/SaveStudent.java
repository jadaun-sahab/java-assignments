package com.masai.day2.Runner;


import com.masai.day2entites.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("product-unit");
	       EntityManager em = emf.createEntityManager();
	       Student student = new Student(005,"vishal@gmail.com", "shivpuri", "java",6);
	      
	       EntityTransaction et = em.getTransaction();
	       et.begin();
	       em.persist(student);
	       et.commit();
	       System.out.println("successfull");
	       
	       em.close();
	}
}