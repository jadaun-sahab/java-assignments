package UI;

import java.util.Scanner;



public class MainUI {
	static void displayManu() {
		System.out.println("1. Insert details of the Employee by taking input from the User");
		System.out.println("2. Insert details of the Department by taking input from the User");
		System.out.println("3. Get all the Employee details who work in the “Account” department");
		System.out.println("4. delete the employee based on deptid, by taking the input from the user");
		System.out.println("5. get the Department details of those employees who live in Mumbai");
	}
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int choice = 0;
		do {
	      displayManu();
			System.out.println("Enter your choice ");
			choice = sr.nextInt();
			
			switch(choice) {
				case 1: 
					EmployeeUI.addDetailsOfEmpUI(sr);
					break;
				case 2:
					DepartUI.addDetailsOfDepart(sr);
					break;
				case 3:
					EmployeeUI.getAccountDeptEmployeeUI();
					break;
				case 4:
					EmployeeUI.deleteEmployeeBydeptId(sr);
					break;
				case 5:
					DepartUI.getDepartDetailsByEmplLocationUI();
					
			}
			
		}while(choice!=0);
	}
}
