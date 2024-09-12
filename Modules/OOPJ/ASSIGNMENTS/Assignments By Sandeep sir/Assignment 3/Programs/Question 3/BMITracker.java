package org.example.BMItracker;
import java.util.Scanner;
public class BMITracker {
	public static Scanner sc = new Scanner(System.in);
	int weight;
	float height;
	float bmi;
	String bmiClass;	
	//methods acceptRecord, calculateBMI, classifyBMI & printRecord
//	1.	Accept weight (in kilograms) and height (in meters) from the user.
	public void acceptRecord() {
		System.out.print("Enter weight (in kg): ");
		weight = sc.nextInt();
		System.out.print("Enter height (in meters): ");
		height = sc.nextFloat();		
	}	
//	2.	Calculate the BMI using the formula: BMI Calculation: BMI = weight / (height * height)
	public void calculateBMI() {
		bmi = weight / ( height * height );		
	}	
//	3.	Classify the BMI into one of the following categories:
		//	o	Under weight: BMI < 18.5
		//	o	Normal weight: 18.5 ≤ BMI < 24.9
		//	o	Overweight: 25 ≤ BMI < 29.9
		//	o	Obese: BMI ≥ 30
	public void classifyBMI() {		
		if ( bmi < 18.5 ) {
			bmiClass = "Underweight";
		}else if( bmi <= 24.9 && bmi >= 18.5 ) {
			bmiClass = "Normal weight";
		}else if( bmi <= 29.9 && bmi >= 25 ) {
			bmiClass = "Overweight"; 
		}else {
			bmiClass = "Obese";
		}		
	}	
//	4.	Display the BMI value and its classification.
	public void printRecord() {
		
		System.out.println("Weight: "+ weight + "kg");	
		System.out.println("Height: "+ height + "m");	
		System.out.println("BMI: "+ String.format("%.2f",bmi));	
		System.out.println("BMI classification: " + bmiClass);	
	}
}
