package org.example.tollboothrevenue;

public class Main {
	public static void main(String[] args) {
		TollBoothRevenueManager t = new TollBoothRevenueManager();
		//methods acceptRecord, setTollRates, calculateRevenue & printRecord 
		t.setTollRates();
		t.acceptRecord();
		t.calculateRevenue();
		t.printRecord();
	}
}
