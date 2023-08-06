package METHODS;

import java.util.Scanner;

import DAO.carimpldao;

public class addcars {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter car_Id");
	String car_id = sc.next();
	
	System.out.println("Enter car_Name");
	String model_name = sc.next();
	
	System.out.println("Enter price");
	int price = sc.nextInt();
	
	System.out.println("Enter total_seats");
	int total_seats = sc.nextInt();
	
	System.out.println("Enter company_id");
	String company_id = sc.next();
	
	carimpldao a = new carimpldao();
	a.addcars(car_id, model_name, price,total_seats,company_id);
	sc.close();
}
}
