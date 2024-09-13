package org.example.CompoundInterestCalc;

public class CompoundInterestCalculator {
    private double principal;
    private double annualInterestRate;
    private int numberOfCompounds;
    private int years;

    public CompoundInterestCalculator(double principal, double annualInterestRate, int numberOfCompounds, int years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.numberOfCompounds = numberOfCompounds;
        this.years = years;
    }

    // Getter and Setter methods
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

    public int getNumberOfCompounds() {
        return numberOfCompounds;
    }

    public void setNumberOfCompounds(int numberOfCompounds) {
        this.numberOfCompounds = numberOfCompounds;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    // Business logic method to calculate the future value
    public double calculateFutureValue() {
        return principal * Math.pow(1 + (annualInterestRate / numberOfCompounds), numberOfCompounds * years);
    }

    // Business logic method to calculate the total interest earned
    public double calculateTotalInterest() {
        return calculateFutureValue() - principal;
    }

    @Override
    public String toString() {
        return "Principal: ₹" + principal +
               "\nAnnual Interest Rate: " + (annualInterestRate * 100) + "%" +
               "\nNumber of Compounds per Year: " + numberOfCompounds +
               "\nInvestment Duration: " + years + " years";
    }
}

