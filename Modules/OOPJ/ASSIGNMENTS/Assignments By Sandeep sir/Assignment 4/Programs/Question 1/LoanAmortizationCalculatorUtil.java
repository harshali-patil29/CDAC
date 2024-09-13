package org.example.loancalc;
import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {
    private LoanAmortizationCalculator calculator;

    // Method to accept user input
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter principal amount (₹): ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter annual interest rate (%): ");
        double interestRate = scanner.nextDouble();
        
        System.out.print("Enter loan term (in years): ");
        int loanTerm = scanner.nextInt();
        
        calculator = new LoanAmortizationCalculator(principal, interestRate, loanTerm);
    }

    // Method to display the monthly payment and total payment
    public void printRecord() {
        System.out.println(calculator.toString());
        System.out.printf("Monthly Payment: ₹%.2f%n", calculator.calculateMonthlyPayment());
        System.out.printf("Total Payment: ₹%.2f%n", calculator.calculateTotalPayment());
    }

    // Method to show menu options
    public void menuList() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Enter loan details");
            System.out.println("2. Display payment details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    acceptRecord();
                    break;
                case 2:
                    if (calculator != null) {
                        printRecord();
                    } else {
                        System.out.println("No loan details available. Please enter loan details first.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 3);
    }
}

