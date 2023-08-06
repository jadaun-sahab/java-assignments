package com.masai.day2.Runner;

import java.util.Scanner;

import com.masai.day2entites.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class search {
public static void main(String[] args) {
	
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("product-unit");
	EntityManager em =emf.createEntityManager();
	

	Scanner sc = new Scanner(System.in);
    System.out.print("Enter Id to search : ");
    int productid = sc.nextInt();
    Product product = em.find(Product.class,productid);
    System.out.println(product.toString());
    em.close();
}
}
