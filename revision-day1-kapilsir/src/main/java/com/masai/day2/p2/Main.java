package com.masai.day2.p2;

import java.time.LocalDate;

public class Main {
	 public static void main(String[] args) throws InvalidMaturityAmountException {
	        String auctionDesc = "91 DTB 13042023 6.35 100000";
	        double maturityAmount = 100000.0;

	        LocalDate maturityDate = getMaturityDate(auctionDesc);
			System.out.println("Maturity Date: " + maturityDate);

			LocalDate settlementDate = getSettlementDate(maturityDate, auctionDesc);
			System.out.println("Settlement Date: " + settlementDate);

			LocalDate allotmentDate = getAnotherDate(settlementDate, -1);
			System.out.println("Allotment Date: " + allotmentDate);

			double initialInvestment = getInitialInvestmentAmount(maturityAmount, auctionDesc);
			System.out.println("Initial Investment Amount: " + initialInvestment);
	    }

	private static double getInitialInvestmentAmount(double maturityAmount, String auctionDesc) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static LocalDate getAnotherDate(LocalDate settlementDate, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static LocalDate getSettlementDate(LocalDate maturityDate, String auctionDesc) {
		// TODO Auto-generated method stub
		return null;
	}

	private static LocalDate getMaturityDate(String auctionDesc) {
		// TODO Auto-generated method stub
		return null;
	}
}
