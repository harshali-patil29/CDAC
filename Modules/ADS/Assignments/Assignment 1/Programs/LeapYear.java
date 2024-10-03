import java.util.Scanner;

class LeapYear{
	public static boolean isLeapyear(int year){
		boolean leap = false;
		if(year %4==0){
			if(year%100==0){
				if(year%400==0){
					leap = true;
				}
				else{
					leap = false;
				}
				
			}
			else{
				leap = true;
			}
		}
		else{
			leap = false;
		}
		return leap;
	}	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println(isLeapyear(year));
	}
}