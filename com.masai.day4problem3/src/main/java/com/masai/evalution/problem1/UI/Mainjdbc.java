package com.masai.evalution.problem1.UI;

import java.util.Scanner;

import com.masai.evalution.problem1.DAO.JobPortalDAO;
import com.masai.evalution.problem1.DAO.JobPortalDAOJdbcImpl;
import com.masai.evalution.problem1.DTO.Applicant;
import com.masai.evalution.problem1.DTO.Applicantimpl;

public class Mainjdbc {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		JobPortalDAO methods = new JobPortalDAOJdbcImpl();
		  int i=0;
		  do {
		    String banner="                                \n"
		                 +"|******************************|\n"
		                 +"|***** Enter Your Choice ******|\n"
		                 +"|******************************|\n"
		                 +"                                \n";
		   System.out.println(banner);
		   System.out.println("Press 1 To find");
		   System.out.println("Press 2 To save");
		   System.out.println("Press 3 To Delete");
		   System.out.println("Press 4 To Update");

		   i=sc.nextInt();
		  
		switch(i) {
		   case 1: 
			 System.out.println("enter id to find ");
			 int id = sc.nextInt();
			 Applicant ap = methods.findApplicantById(id);
			 System.out.println(ap);
		   break;
		   case 2:
			   System.out.println("enter id to save ");
				id = sc.nextInt();
			   System.out.println("enter email ");
			   String email  = sc.next();
			   System.out.println("enter address ");
			   String add  = sc.next();
			   System.out.println("enter mobNo ");
			   String mobNo  = sc.next();
			   System.out.println("enter category ");
			   String category  = sc.next();
			   System.out.println("enter experience ");
				int exp = sc.nextInt();
				Applicant ap2 =new Applicantimpl(id, email,add,mobNo,category,exp);
				String s = methods.saveApplicant(ap2);
		   break;
		   case 3:
			   System.out.println("enter id to delete ");
				  id = sc.nextInt();
				 String ap1 = methods.deleteApplicantById(id);
				 System.out.println(ap1);
				 break;
		   case 4:
			   System.out.println("enter id ");
				  id = sc.nextInt();
				  System.out.println("enter experience ");
				  exp = sc.nextInt();
				  String s3= methods.updateApplicantExperience(id, exp);
				 System.out.println(s3);
		   break;
		  
		   }
		   
		  }while(i!=0);
		  System.out.println(" * * * Have A GOOD DAY! * * * "); 
	
	}
}
