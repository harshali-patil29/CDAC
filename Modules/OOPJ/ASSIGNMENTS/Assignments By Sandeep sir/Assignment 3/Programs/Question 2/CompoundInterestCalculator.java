package org.example.CompoundInterestCal;

import java.util.Scanner;
public class CompoundInterestCalculator {
	public static Scanner sc = new Scanner(System.in);
	double initialInvestment;
    double annualInterestRate;
    int timesCompoundedPerYear;
    int investmentDuration;
    double futureValue;
    double totalInterest;    
	//1.	Accept the initial investment amount, annual interest rate, number of times the interest is compounded per year, 
	//and investment duration (in years) from the user.
	public void acceptRecord() {
		
		System.out.print("Enter initial investment amount: Rs.");
		initialInvestment = sc.nextDouble();
		System.out.print("Enter annual interest rate: ");
		annualInterestRate = sc.nextDouble();
		System.out.print("Enter number of times the interest is compounded per year: ");
		timesCompoundedPerYear = sc.nextInt();	
		System.out.print("Enter investment duration (in years): ");		
		investmentDuration = sc.nextInt();
	}
	//2.	Calculate the future value of the investment using the formula: Future Value Calculation:
	//futureValue = principal * (1 + annualInterestRate / numberOfCompounds)^(numberOfCompounds * years)
	//Total Interest Earned: totalInterest = futureValue - principal

	public void calculateFuturevalue() {
		double r = annualInterestRate / 100;
        futureValue = initialInvestment * Math.pow(1 + r / timesCompoundedPerYear, timesCompoundedPerYear * investmentDuration);
        totalInterest = futureValue - initialInvestment;			
	}
	
	public void printRecord() {		
		System.out.println("Initial Investment: Rs." + String.format("%.2f", initialInvestment));
        System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
        System.out.println("Times Compounded Per Year: " + timesCompoundedPerYear);
        System.out.println("Investment Duration: " + investmentDuration + " years");
        System.out.println("Future Value: Rs." + String.format("%.2f", futureValue));
        System.out.println("Total Interest Earned: Rs." + String.format("%.2f", totalInterest));
        
	}

}
