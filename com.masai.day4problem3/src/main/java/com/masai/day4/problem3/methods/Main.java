package com.masai.day4.problem3.methods;

import java.util.Scanner;
import com.masai.day4.problem3.DAO.CourtDAO;
import com.masai.day4.problem3.DAO.CourtDAOJdbcImpl;
import com.masai.day4.problem3.entites.Lawyer;

public class Main {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		CourtDAO methods = new CourtDAOJdbcImpl();
		  int i=0;
		  do {
		    String banner="                                \n"
		                 +"|******************************|\n"
		                 +"|***** Enter Your Choice ******|\n"
		                 +"|******************************|\n"
		                 +"                                \n";
		   System.out.println(banner);
		   System.out.println("Press 1 To save Lawyer");
		   System.out.println("Press 2 To find layer");
		   System.out.println("Press 3 To update Lawyer Experience");
		   System.out.println("Press 4 To delete Lawyer");

		   i=sc.nextInt();
		   boolean s;
		   String k;
		Object v;
		switch(i) {
		   case 1: 
			   CourtDAO lawyer = new CourtDAOJdbcImpl();
			    v = methods.saveLawyer((Lawyer) lawyer);
			   System.out.println(v);
		   break;
		   case 2:
			   System.out.println("Enter Lawyer id");
			   int id = sc.nextInt();
			   Lawyer e = methods.findLawyerById(id);
			   System.out.println(e);
		   break;
		   case 3:
			   int i1 = 0;
			   int amount = 0;
			   k = methods.updateLawyerExperience(i1, amount);
			   System.out.println(k);
			   break;
		   case 4:
			   System.out.println("enter lawyer id ");
			    id = sc.nextInt();
			   s = methods.deleteLawyerById(id);
			   System.out.println(s);
		   break;
		  
		   }
		   
		  }while(i!=0);
		  System.out.println(" * * * Have A GOOD DAY! * * * "); 
	
	}
}