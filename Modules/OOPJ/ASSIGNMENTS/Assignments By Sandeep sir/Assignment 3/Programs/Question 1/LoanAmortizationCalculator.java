package org.example.loancalculator;
import java.util.Scanner;
import java.lang.Math;
public class LoanAmortizationCalculator {
	int principal;
	double monthlyInterestRate;
	float annualInterestRate;
	int loanTerm;
	int numberOfMonths;
	double monthlyPayment;
	public static Scanner sc= new Scanner(System.in);		    
	//methods acceptRecord, calculateMonthlyPayment & printRecord	
	//1.Accept the principal amount (loan amount), 
	//annual interest rate, and loan term (in years) from the user.
	public void acceptRecord() {
		System.out.print("Enter principal amount (Loan amount) : Rs.");
		principal = sc.nextInt();
		System.out.print("Enter annual interest rate : ");
		annualInterestRate = sc.nextFloat();
		System.out.print("Enter loan term ( in years ) :");
		loanTerm = sc.nextInt();	
		monthlyInterestRate = annualInterestRate / 12 / 100;
		numberOfMonths = loanTerm * 12;
		
		
	}	
	//monthlyPayment = principal * (monthlyInterestRate * (1 + monthlyInterestRate)^(numberOfMonths)) / ((1 + monthlyInterestRate)^(numberOfMonths) - 1)
	//Where monthlyInterestRate = annualInterestRate / 12 / 100 and numberOfMonths = loanTerm * 12
	//Note: Here ^ means power and to find it you can use Math.pow( ) method

	public void calculateMonthlyPayment() {
		if (monthlyInterestRate != 0) {
            monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths))
                    / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
        } else {
            // If interest rate is 0, the monthly payment is just the principal divided by number of months
            monthlyPayment = principal / numberOfMonths;
        }
		//monthlyPayment = principal * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate),(numberOfMonths)) / (Math.pow((1 + monthlyInterestRate),(numberOfMonths)) - 1));
	}	
	public void printRecord() {
		System.out.println("Principal: " + principal);
        System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
        System.out.println("Loan Term: " + loanTerm + " years");
        System.out.println("Monthly Payment: Rs." + String.format("%.2f", monthlyPayment));
	}
}
