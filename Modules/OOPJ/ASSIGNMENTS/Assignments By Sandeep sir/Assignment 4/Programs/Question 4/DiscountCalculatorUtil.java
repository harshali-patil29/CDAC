package org.example.retails;
import java.util.Scanner;

public class DiscountCalculatorUtil {

    private Scanner scanner = new Scanner(System.in);
    private DiscountCalculator calculator;

    // Method to accept user input
    public void acceptRecord() {
        System.out.println("Enter the original price of the item (₹): ");
        double originalPrice = scanner.nextDouble();
        
        System.out.println("Enter the discount rate (percentage): ");
        double discountRate = scanner.nextDouble();
        
        calculator = new DiscountCalculator(originalPrice, discountRate);
    }

    // Method to print the discount amount and final price
    public void printRecord() {
        double discountAmount = calculator.calculateDiscountAmount();
        double finalPrice = calculator.calculateFinalPrice();
        
        System.out.println("\n--- Price Summary ---");
        System.out.println(calculator);
        System.out.printf("Discount Amount: ₹%.2f\n", discountAmount);
        System.out.printf("Final Price: ₹%.2f\n", finalPrice);
    }

    // Method to display a menu
    public void menuList() {
        System.out.println("Discount Calculator Menu:");
        System.out.println("1. Enter Original Price and Discount Rate");
        System.out.println("2. Show Discount and Final Price");
        System.out.println("3. Exit");
    }
}
