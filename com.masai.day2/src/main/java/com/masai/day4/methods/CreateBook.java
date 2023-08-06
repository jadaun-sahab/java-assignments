package com.masai.day4.methods;

import com.masai.day4entites.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CreateBook {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("product-unit");
	       EntityManager em = emf.createEntityManager();
	       Book book = new Book(101,"C++", "vikas","Rajput Publication", "Computer Programming", 1500, 240, "2019-12-11 10:58:37");
	      
	       EntityTransaction et = em.getTransaction();
	       et.begin();
	       em.persist(book);
	       et.commit();
	       System.out.println("Book created successfully");
	       
	       em.close();
	}
}
