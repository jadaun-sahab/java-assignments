package com.masai.problem2;

public class FeeWithCess extends FeeExpenses {
    private double cess;

    public FeeWithCess(double tuitionFee, double serviceTax, double cess) {
        super(tuitionFee, serviceTax);
        this.cess = cess;
    }

    @Override
    public double getTotalFee() {
        double totalFee = super.getTotalFee();
        totalFee += totalFee * cess / 100;
        return Math.round(totalFee * 100.0) / 100.0;
    }
}