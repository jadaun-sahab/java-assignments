package com.masai.problem1;

public class Main {

	public static void main(String[] args) {
	
		FixedDepositAccount fdAccount = new FixedDepositAccount(5000, 5);
		
	double mv = fdAccount.calculateMaturityValue();
	System.out.println("Maturity Value: " + mv);

	LoanAgainstFixedDepositAccount loanAccount = new LoanAgainstFixedDepositAccount(5000, 5, 3000, 8);

	double totalPayment = loanAccount.calculateTotalPayment();
	System.out.println("Total Payment: " + totalPayment);
	}
	
}
