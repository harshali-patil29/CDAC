package org.example.bmi;
import java.util.Scanner;

public class BMITrackerUtil {

    private Scanner scanner = new Scanner(System.in);
    private BMITracker tracker;
    // Method to accept user input
    public void acceptRecord() {
        System.out.println("Enter your weight (in kilograms): ");
        double weight = scanner.nextDouble();
        
        System.out.println("Enter your height (in meters): ");
        double height = scanner.nextDouble();
        
        tracker = new BMITracker(weight, height);
    }
    // Method to print the BMI value and classification
    public void printRecord() {
        double bmi = tracker.calculateBMI();
        String classification = tracker.classifyBMI();
        
        System.out.println("\n--- BMI Summary ---");
        System.out.println(tracker);
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Classification: " + classification);
    }
    // Method to display a menu
    public void menuList() {
        System.out.println("BMI Tracker Menu:");
        System.out.println("1. Enter Weight and Height");
        System.out.println("2. Show BMI and Classification");
        System.out.println("3. Exit");
    }
}
