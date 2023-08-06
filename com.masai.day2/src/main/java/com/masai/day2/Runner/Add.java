package com.masai.day2.Runner;

import java.util.Scanner;

import com.masai.day2entites.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Add {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("product-unit");
	       EntityManager em = emf.createEntityManager();
 Product product = new Product( "fan", 2, 4000, "bajaj");
	       
	       EntityTransaction et = em.getTransaction();
	       et.begin();
	       em.persist(product);
	       et.commit();
	       System.out.println("successfull");
	       
	       em.close();
	}
}
