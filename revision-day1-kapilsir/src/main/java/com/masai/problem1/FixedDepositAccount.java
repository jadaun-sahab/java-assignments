package com.masai.problem1;

public class FixedDepositAccount {

	private double depositeAmount;
	private double fdInterestRate;
	
	
	public FixedDepositAccount(double depositeAmount, double fdInterestRate) {
		super();
		this.depositeAmount = depositeAmount;
		this.fdInterestRate = fdInterestRate;
	}
	
	 public double calculateMaturityValue(){
		 double mv = depositeAmount * (1 + fdInterestRate / 100);
	     return Math.round(mv * 100.0) / 100.0;
	}
	
}
