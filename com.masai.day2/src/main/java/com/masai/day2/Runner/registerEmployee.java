package com.masai.day2.Runner;

import com.masai.day2entites.Eployee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class registerEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("product-unit");
	       EntityManager em = emf.createEntityManager();
	       Eployee eployee = new Eployee(001,"vikas", "shivpuri",60000);
	      
	       EntityTransaction et = em.getTransaction();
	       et.begin();
	       em.persist(eployee);
	       et.commit();
	       System.out.println("successfull");
	       
	       em.close();
	}
}
