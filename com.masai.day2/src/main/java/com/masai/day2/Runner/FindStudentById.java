package com.masai.day2.Runner;

import java.util.Scanner;

import com.masai.day2entites.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FindStudentById {
	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("product-unit");
		EntityManager em =emf.createEntityManager();
		

		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter studentCode to search : ");
	    int studentCode = sc.nextInt();
	    Student student = em.find(Student.class,studentCode);
	    System.out.println(student.toString());
	}
}
