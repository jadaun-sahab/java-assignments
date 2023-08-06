package com.masai.day4.methods;

import java.util.Scanner;

import com.masai.day4entites.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DeleteBook {
public static void main(String[] args) {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("product-unit");
	EntityManager em =emf.createEntityManager();
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Book id to delete Book");
	int bookid=sc.nextInt();
	 Book book = em.find(Book.class,bookid);
	 if(book !=null) {
		 em.getTransaction().begin();
		 em.remove(book);
		 em.getTransaction().commit();
		 System.out.println("Book removed successfully");
	 }
	 else {
		 System.out.println("Book not removed ");
		 em.close();
		 System.out.println("completeed");
	 }
}
}
