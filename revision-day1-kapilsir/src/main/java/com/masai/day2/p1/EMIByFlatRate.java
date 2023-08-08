package com.masai.day2.p1;

public class EMIByFlatRate implements EquatedMonthlyInstallment{
	public double getEMIAmount(double principleAmount, double interestRate, double timePeriod) {
        double interest = (principleAmount * interestRate * timePeriod) / 100;
        double totalPayableAmount = principleAmount + interest;
        double emiAmount = totalPayableAmount / (timePeriod * 12);
        return emiAmount;
    }
}
