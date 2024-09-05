import java.util.Scanner;

class LeapYear{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a year: ");
	int year = sc.nextInt();
	sc.close();
	
	// System.out.println(year);
	
	//logic
	// If the year is divisible by 400, it is a leap year.
	if(year%400==0){
		System.out.println(year+" is a Leap year!");
	}
	// If the year is divisible by 100 but not by 400, it is not a leap year.
	else if(year%100==0 && year%400 != 0){
		System.out.println(year+" is Not a Leap year!");
	}
	// If the year is divisible by 4 but not by 100, it is a leap year.
	else if(year%4==0 && year%100!=0){
		System.out.println(year+" is a Leap year!");
	}
	// Otherwise, it is not a leap year.
	else{
		System.out.println(year+" is Not a Leap year!");
	}
	
	
	
	}
}