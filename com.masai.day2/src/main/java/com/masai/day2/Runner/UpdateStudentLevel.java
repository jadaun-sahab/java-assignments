package com.masai.day2.Runner;

import java.util.Scanner;

import com.masai.day2entites.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UpdateStudentLevel {
public static void main(String[] args) {
	
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("product-unit");
	EntityManager em =emf.createEntityManager();
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter student id to update the level");
	int studentCode=sc.nextInt();
	 Student student = em.find(Student.class,studentCode);
	 if(student ==null) {
		 System.out.println("student deos not exist");
	 }
	 else {
		 System.out.println("enter the level till you want to increase ");
		 int level=sc.nextInt();
		 em.getTransaction().begin();
		 student.setLevel(student.getLevel()+level);
		 em.getTransaction().commit();
		 System.out.println("level increaseed");
		 em.close();
	 }
}
}
