package com.masai.day2.p2;

import java.time.LocalDate;

public class TBillDemo   {
	
	public static LocalDate getMaturityDate(String auctionDesc) {
        String[] tokens = auctionDesc.split(" ");
        String maturityDateString = tokens[2];
        int day = Integer.parseInt(maturityDateString.substring(0, 2));
        int month = Integer.parseInt(maturityDateString.substring(2, 4));
        int year = Integer.parseInt(maturityDateString.substring(4));
        return LocalDate.of(year, month, day);
    }
	public static LocalDate getSettlementDate(LocalDate maturityDate, String auctionDesc) {
        String[] tokens = auctionDesc.split(" ");
        int days = Integer.parseInt(tokens[0]);
        return maturityDate.minusDays(days);
    }

    
    public static LocalDate getAnotherDate(LocalDate settlementDate, int days) {
        return settlementDate.plusDays(days);
    }

    
    public static double getInitialInvestmentAmount(double maturityAmount, String auctionDesc) throws InvalidMaturityAmountException {
        String[] tokens = auctionDesc.split(" ");
        double yieldToMaturityPercentage = Double.parseDouble(tokens[3]);
        double durationOfTBill = Double.parseDouble(tokens[0]) / 365.0;

        if (maturityAmount % 10000 != 0) {
            throw new InvalidMaturityAmountException("Invalid Maturity amount");
        }

        double initialInvestment = 100.0 / (((yieldToMaturityPercentage * durationOfTBill) / 36500.0) + 1) * (maturityAmount / 100.0);
        return initialInvestment;
    }
}
