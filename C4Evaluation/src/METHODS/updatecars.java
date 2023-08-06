package METHODS;

import java.util.Scanner;

import DAO.carimpldao;



public class updatecars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter car_Id");
		String car_id = sc.next();
		System.out.println("Enter car_Name");
		String model_name = sc.next();
		System.out.println("Enter model_name");
		int price = sc.nextInt();
		System.out.println("Enter price");
		int total_seats = sc.nextInt();
		System.out.println("Enter company_id");
		String company_id = sc.next();
		
		carimpldao a = new carimpldao();
		a.updatecars(car_id, model_name, price,total_seats,company_id);
		sc.close();
	}

}
