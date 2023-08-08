package com.masai.problem2;

public class Main {
    public static void main(String[] args) {
        
        FeeExpenses feeExpenses = new FeeExpenses(50000, 10);

        double totalFee = feeExpenses.getTotalFee();
        System.out.println("Total Fee (without cess): " + totalFee);

        FeeWithCess feeWithCess = new FeeWithCess(50000, 10, 2);

        double totalFeeWithCess = feeWithCess.getTotalFee();
        System.out.println("Total Fee (with cess): " + totalFeeWithCess);
    }
}