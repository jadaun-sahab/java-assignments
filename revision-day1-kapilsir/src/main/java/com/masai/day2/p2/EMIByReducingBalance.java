package com.masai.day2.p2;

import com.masai.day2.p1.EquatedMonthlyInstallment;

public class EMIByReducingBalance implements EquatedMonthlyInstallment {
    
    public double getEMIAmount(double principleAmount, double interestRate, double timePeriod) {
        double r = interestRate / 1200;
        double n = timePeriod * 12;
        double emiAmount = principleAmount * ((r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1));
        return emiAmount;
    }
}