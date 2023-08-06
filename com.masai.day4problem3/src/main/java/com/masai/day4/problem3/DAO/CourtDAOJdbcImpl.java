package com.masai.day4.problem3.DAO;

import java.util.Scanner;
import com.masai.day4.problem3.entites.Lawyer;
import com.masai.day4.problem3.utility.EMUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class CourtDAOJdbcImpl implements CourtDAO{

	public Lawyer findLawyerById(int id) {
		EntityManager em = EMUtil.provideEntityManager();
		Lawyer lawyer = em.find(Lawyer.class, id);
		String getAddress = null;
		if(lawyer !=null) {
		em.getTransaction().begin();
		getAddress=lawyer.getAddress();
		em.getTransaction().commit();
		}
		else {
			System.out.println("Lawyer deos not exist");
		}
		em.close();
		return lawyer ;
		
	}
	
	public String saveLawyer(Lawyer lawyer) {
		EntityManager em = EMUtil.provideEntityManager();
	em.getTransaction().begin();
	Lawyer lawyer1 = new Lawyer(2,"himu","himu@gmail.com","shivpuri",4);
       em.getTransaction().begin();
       em.persist(lawyer1);
       em.getTransaction().commit();
       System.out.println("successfull");
       em.close();
	return null;
	}

	public boolean deleteLawyerById(int id) {
		boolean flag =false;
		EntityManager em = EMUtil.provideEntityManager();
		Lawyer lawyer = em.find(Lawyer.class, id);
		if(lawyer !=null) {
		em.getTransaction().begin();
		em.remove(lawyer);
		flag=true;
		em.getTransaction().commit();
		}
		em.close();
		return flag;
	}

	public String updateLawyerExperience(int id, int experience) {
		EntityManager em = EMUtil.provideEntityManager();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter lawyer id to update the experience");
		int exp=sc.nextInt();
		Lawyer lawyer = em.find(Lawyer.class,exp);
		 if(lawyer ==null) {
			 System.out.println("lawyer deos not exist");
		 }
		 else {
			 System.out.println("Enter the Experience");
			 exp=sc.nextInt();
			 em.getTransaction().begin();
			 lawyer.setExperience(lawyer.getExperience()+exp);
			 em.getTransaction().commit();
			 System.out.println("bonus granted");
			 em.close();
		 }
		return null;
	}

	

}
