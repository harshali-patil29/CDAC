package org.example.retailsales;

public class Main {
	public static void main(String[] args) {
		DiscountCalculator d = new DiscountCalculator();
		//methods acceptRecord, calculateDiscount & printRecord 
		d.acceptRecord();
		d.calculateDiscount();
		d.printRecord();
	}
}
