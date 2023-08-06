package com.masai.day2.Runner;

import java.util.Scanner;

import com.masai.day2entites.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DeleteStudentById {
public static void main(String[] args) {
	
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("product-unit");
	EntityManager em =emf.createEntityManager();
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter student id to delete student data");
	int studentCode=sc.nextInt();
	 Student student = em.find(Student.class,studentCode);
	 if(student !=null) {
		 em.getTransaction().begin();
		 em.remove(student);
		 em.getTransaction().commit();
		 System.out.println("student removed successfully");
	 }
	 else {
		 System.out.println("student not removed ");
		 em.close();
		 System.out.println("completeed");
	 }
}
}
