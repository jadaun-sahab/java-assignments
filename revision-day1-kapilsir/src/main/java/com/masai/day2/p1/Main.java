package com.masai.day2.p1;

public class Main {
	 public static void main(String[] args) {
	        double principleAmount = 10000;
	        double interestRate = 7.0;
	        double timePeriod = 2;

	        EquatedMonthlyInstallment emiFlatRate = new EMIByFlatRate();
	        double emiFlatRateAmount = emiFlatRate.getEMIAmount(principleAmount, interestRate, timePeriod);
	        double totalPayableAmountFlatRate = emiFlatRateAmount * (timePeriod * 12);

	        EquatedMonthlyInstallment emiReducingBalance = new EMIByReducingBalance();
	        double emiReducingBalanceAmount = emiReducingBalance.getEMIAmount(principleAmount, interestRate, timePeriod);
	        double totalPayableAmountReducingBalance = emiReducingBalanceAmount * (timePeriod * 12);

	        System.out.println("EMI amount (Flat Rate Scheme): " + emiFlatRateAmount);
	        System.out.println("Total Payable amount (Flat Rate Scheme): " + totalPayableAmountFlatRate);

	        System.out.println("EMI amount (Reducing Balance Scheme): " + emiReducingBalanceAmount);
	        System.out.println("Total Payable amount (Reducing Balance Scheme): " + totalPayableAmountReducingBalance);
	    }
}
