package com.masai.day4.methods;

import java.util.Scanner;
import com.masai.day4entites.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UpdateBook {
	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("product-unit");
		EntityManager em =emf.createEntityManager();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter book id to update the price");
		int bookid=sc.nextInt();
		Book book = em.find(Book.class,bookid);
		 if(book ==null) {
			 System.out.println("Book deos not exist");
		 }
		 else {
			 System.out.println("enter the price to increase the price");
			 int amount=sc.nextInt();
			 em.getTransaction().begin();
			 book.setPrice(book.getPrice()+amount);
			 em.getTransaction().commit();
			 System.out.println("price increaseed");
			 em.close();
		 }
	}
}
