package com.masai.day4.methods;

import java.util.Scanner;

import com.masai.day4.DAO.EmployeeDao;
import com.masai.day4.DAO.EmployeeDaoimpl;
import com.masai.day4entites.Employee;


public class Main {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		EmployeeDaoimpl methods = new EmployeeDaoimpl();
		  int i=0;
		  do {
		    String banner="                                \n"
		                 +"|******************************|\n"
		                 +"|***** Enter Your Choice ******|\n"
		                 +"|******************************|\n"
		                 +"                                \n";
		   System.out.println(banner);
		   System.out.println("Press 1 To save");
		   System.out.println("Press 2 To getAddressOfEmployee");
		   System.out.println("Press 3 To giveBonusToEmployee");
		   System.out.println("Press 4 To deleteEmployee");

		   i=sc.nextInt();
		   boolean s;
		   String k;
		Object v;
		switch(i) {
		   case 1: 
			   EmployeeDaoimpl em = new EmployeeDaoimpl();
			    v = methods.save(em);
			   System.out.println(v);
		   break;
		   case 2:
			   System.out.println("Enter empid");
			   int id = sc.nextInt();
			   String e = methods.getAddressOfEmployee(id);
			   System.out.println(e);
		   break;
		   case 3:
			   int i1 = 0;
			   int amount = 0;
			   k = methods.giveBonusToEmployee(i1, amount);
			   System.out.println(k);
			   break;
		   case 4:
			   System.out.println("enter lawyer id ");
			    id = sc.nextInt();
			   s = methods.deleteEmployee(id);
			   System.out.println(s);
		   break;
		  
		   }
		   
		  }while(i!=0);
		  System.out.println(" * * * Have A GOOD DAY! * * * "); 
	
	}
}
