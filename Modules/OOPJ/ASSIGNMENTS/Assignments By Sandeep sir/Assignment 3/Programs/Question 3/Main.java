package org.example.BMItracker;

public class Main {
	public static void main(String[] args) {
		BMITracker b = new BMITracker();
//		methods acceptRecord, calculateBMI, classifyBMI & printRecord
		b.acceptRecord();
		b.calculateBMI();
		b.classifyBMI();
		b.printRecord();
	}
}
