package com.masai.problem4;

public class EPFOAccount {
    private String accountNo;
    private double balance;

    public EPFOAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account number: " + accountNo + " Balance: " + balance + "/-";
    }
}