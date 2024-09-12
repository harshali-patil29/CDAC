package org.example.tollboothrevenue;
import java.util.Scanner;

public class TollBoothRevenueManager {
	public static Scanner sc = new Scanner(System.in);
	float carTollRate;
	float truckTollRate;
	float motorcycleTollRate;
    private int numCars;
    private int numTrucks;
    private int numMotorcycles;
    private float totalRevenue;
    private int totalVehicles;
	
//1.	Allow the user to set toll rates for different vehicle types: Car, Truck, and Motorcycle.
//	2.	Accept the number of vehicles of each type passing through the toll booth.
//	3.	Calculate the total revenue based on the toll rates and number of vehicles.
//	4.	Display the total number of vehicles and the total revenue collected, in Indian Rupees (₹).

    public void setTollRates() {
        System.out.print("Enter toll rate for Car (₹): ");
        carTollRate = sc.nextFloat();
        System.out.print("Enter toll rate for Truck (₹): ");
        truckTollRate = sc.nextFloat();
        System.out.print("Enter toll rate for Motorcycle (₹): ");
        motorcycleTollRate = sc.nextFloat();
    }    
    public void acceptRecord() {
        System.out.print("Enter the number of cars: ");
        numCars = sc.nextInt();
        System.out.print("Enter the number of trucks: ");
        numTrucks = sc.nextInt();
        System.out.print("Enter the number of motorcycles: ");
        numMotorcycles = sc.nextInt();
    }
    public void calculateRevenue() {
        totalRevenue = (numCars * carTollRate) + (numTrucks * truckTollRate) + (numMotorcycles * motorcycleTollRate);
        totalVehicles = numCars + numTrucks + numMotorcycles;
    }    
    public void printRecord() {
        System.out.printf("Total number of vehicles: %d%n", totalVehicles);
        System.out.printf("Total revenue collected: ₹%.2f%n", totalRevenue);
    }
}
