package com.masai.day4.methods;

import java.util.Scanner;
import com.masai.day4entites.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class GetBook {
public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("product-unit");
		EntityManager em =emf.createEntityManager();

		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter bookid to search : ");
	    int BookId = sc.nextInt();
	    Book book = em.find(Book.class,BookId);
	    System.out.println(book.toString());
	}
}