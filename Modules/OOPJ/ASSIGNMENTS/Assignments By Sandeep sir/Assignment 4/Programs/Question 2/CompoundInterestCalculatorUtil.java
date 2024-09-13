package org.example.CompoundInterestCalc;

import java.util.Scanner;

public class CompoundInterestCalculatorUtil {

    private Scanner scanner = new Scanner(System.in);
    private CompoundInterestCalculator calculator;

    // Method to accept user input
    public void acceptRecord() {
        System.out.println("Enter the initial investment amount (₹): ");
        double principal = scanner.nextDouble();
        
        System.out.println("Enter the annual interest rate (as a decimal, e.g., 0.05 for 5%): ");
        double annualInterestRate = scanner.nextDouble();
        
        System.out.println("Enter the number of times the interest is compounded per year: ");
        int numberOfCompounds = scanner.nextInt();
        
        System.out.println("Enter the investment duration (in years): ");
        int years = scanner.nextInt();
        
        calculator = new CompoundInterestCalculator(principal, annualInterestRate, numberOfCompounds, years);
    }

    // Method to print the future value and interest earned
    public void printRecord() {
        double futureValue = calculator.calculateFutureValue();
        double totalInterest = calculator.calculateTotalInterest();
        
        System.out.println("\n--- Investment Summary ---");
        System.out.println(calculator);
        System.out.printf("Future Value: ₹%.2f\n", futureValue);
        System.out.printf("Total Interest Earned: ₹%.2f\n", totalInterest);
    }

    // Method to display a menu
    public void menuList() {
        System.out.println("Compound Interest Calculator Menu:");
        System.out.println("1. Enter Investment Details");
        System.out.println("2. Show Results");
        System.out.println("3. Exit");
    }
}
