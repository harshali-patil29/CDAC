package org.example.loancalculator;

public class Main {
	
	public static void main(String[] args) {
		LoanAmortizationCalculator p1 = new LoanAmortizationCalculator();
		p1.acceptRecord();
		p1.calculateMonthlyPayment();
		p1.printRecord();
	}

}
