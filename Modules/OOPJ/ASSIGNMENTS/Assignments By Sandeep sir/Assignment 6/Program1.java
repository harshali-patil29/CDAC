import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		//displaying the default values in an array
		System.out.println("Default values are: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Array["+i+"] : "+ arr[i]);
		}		
		//accepting records from the user 
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter arr["+i+"]: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Updated array: ");
		//printing elements of an array entered by user
		for(int i=0;i<arr.length;i++) {
			System.out.println("Array["+i+"] : "+arr[i]);
		}
		sc.close();
	}
}