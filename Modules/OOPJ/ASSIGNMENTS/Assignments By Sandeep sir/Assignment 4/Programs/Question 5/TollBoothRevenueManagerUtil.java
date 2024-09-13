package org.example.tollboothmanagement;
import java.util.Scanner;

public class TollBoothRevenueManagerUtil {

    private Scanner scanner = new Scanner(System.in);
    private TollBoothRevenueManager manager;

    // Method to accept user input for toll rates and vehicle counts
    public void acceptRecord() {
        System.out.println("Enter the toll rate for Cars (₹): ");
        double carRate = scanner.nextDouble();

        System.out.println("Enter the toll rate for Trucks (₹): ");
        double truckRate = scanner.nextDouble();

        System.out.println("Enter the toll rate for Motorcycles (₹): ");
        double motorcycleRate = scanner.nextDouble();

        manager = new TollBoothRevenueManager(carRate, truckRate, motorcycleRate);

        System.out.println("Enter the number of Cars passed: ");
        int carCount = scanner.nextInt();
        manager.setCarCount(carCount);

        System.out.println("Enter the number of Trucks passed: ");
        int truckCount = scanner.nextInt();
        manager.setTruckCount(truckCount);

        System.out.println("Enter the number of Motorcycles passed: ");
        int motorcycleCount = scanner.nextInt();
        manager.setMotorcycleCount(motorcycleCount);
    }

    // Method to print the total revenue and vehicle count
    public void printRecord() {
        double totalRevenue = manager.calculateTotalRevenue();
        int totalVehicles = manager.calculateTotalVehicles();

        System.out.println("\n--- Toll Booth Summary ---");
        System.out.println(manager);
        System.out.printf("Total Vehicles Passed: %d\n", totalVehicles);
        System.out.printf("Total Revenue Collected: ₹%.2f\n", totalRevenue);
    }

    // Method to display a menu
    public void menuList() {
        System.out.println("Toll Booth Revenue Manager Menu:");
        System.out.println("1. Enter Toll Rates and Vehicle Count");
        System.out.println("2. Show Total Revenue and Vehicle Count");
        System.out.println("3. Exit");
    }
}

