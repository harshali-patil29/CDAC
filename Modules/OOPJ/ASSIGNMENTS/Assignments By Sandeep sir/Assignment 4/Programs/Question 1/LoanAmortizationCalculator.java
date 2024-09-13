package org.example.loancalc;
public class LoanAmortizationCalculator {
    
    private double principal;
    private double annualInterestRate;
    private int loanTerm; // in years

    // Constructor
    public LoanAmortizationCalculator(double principal, double annualInterestRate, int loanTerm) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.loanTerm = loanTerm;
    }

    // Getters and Setters
    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    // Method to calculate monthly payment
    public double calculateMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfMonths = loanTerm * 12;
        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / 
               (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
    }

    // Method to calculate total payment over the loan period
    public double calculateTotalPayment() {
        return calculateMonthlyPayment() * loanTerm * 12;
    }

    // toString method to display loan details
    @Override
    public String toString() {
        return "Principal: ₹" + principal + "\nAnnual Interest Rate: " + annualInterestRate + "%\nLoan Term: " + loanTerm + " years";
    }
}
