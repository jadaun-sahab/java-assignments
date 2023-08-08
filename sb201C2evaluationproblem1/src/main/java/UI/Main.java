package UI;

import java.util.Scanner;

import DAO.EcomDaoImpl;

public class Main {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		EcomDaoImpl methods = new EcomDaoImpl();
		  int i=0;
		  do {
		    String banner="                                \n"
		                 +"|******************************|\n"
		                 +"|***** Enter Your Choice ******|\n"
		                 +"|******************************|\n"
		                 +"                                \n";
		   System.out.println(banner);
		   System.out.println("Press 1 To addSeller");
		   System.out.println("Press 2 To addProduct");
//		   System.out.println("Press 3 To getProductBySeller");
//		   System.out.println("Press 4 To getProductById");

		   i=sc.nextInt();
		  
		switch(i) {
		   case 1: 
			 
		   break;
		   case 2:
			   
		   break;
//		   case 3:
		   
//		   break
//		   case 4:
//
//		   break;
		  
		   }
		   
		  }while(i!=0);
		  System.out.println(" * * * Have A GOOD DAY! * * * "); 
	
	}
}
