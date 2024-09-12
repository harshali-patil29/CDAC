package org.example.retailsales;

import java.util.Scanner;

public class DiscountCalculator {

	public static Scanner sc = new Scanner(System.in);
	int originalPrice;
	int discountRate;
	float discountAmount;
	float finalPrice;
//	1.	Accept the original price of an item and the discount percentage from the user.
//	2.	Calculate the discount amount and the final price using the following formulas:
//		o	Discount Amount Calculation: discountAmount = originalPrice * (discountRate / 100)
//		o	Final Price Calculation: finalPrice = originalPrice - discountAmount
//	3.	Display the discount amount and the final price of the item, in Indian Rupees (₹).

	public void acceptRecord() {
		// TODO Auto-generated method stub
		System.out.print("Enter original price of an item: ");
		originalPrice = sc.nextInt();
		System.out.print("Enter discount percentage: ");
		discountRate = sc.nextInt();
		
	}

	public void calculateDiscount() {
		// TODO Auto-generated method stub
		discountAmount = originalPrice * (discountRate / 100.0f);
		finalPrice = originalPrice - discountAmount;		
	}

	public void printRecord() {
		// TODO Auto-generated method stub
		System.out.printf("Discount amount: ₹%.2f%n", discountAmount);
		System.out.printf("Final price: ₹%.2f%n", finalPrice);
		
	}

}
