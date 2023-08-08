package com.masai.problem1;

public class LoanAgainstFixedDepositAccount extends FixedDepositAccount {
    private double loanAmount;
    private double loanInterestRate;

    public LoanAgainstFixedDepositAccount(double depositAmount, double fdInterestRate, double loanAmount, double loanInterestRate) {
        super(depositAmount, fdInterestRate);
        this.loanAmount = loanAmount;
        this.loanInterestRate = loanInterestRate;
    }

    public double calculateTotalPayment() {
        double amount = loanAmount + (loanAmount * loanInterestRate) / 100;
        return Math.round(amount * 100.0) / 100.0;
    }
}