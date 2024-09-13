import java.util.Arrays;
import java.util.Scanner;

public class Program7 {
	int[] arr;
	public static Scanner sc = new Scanner(System.in);
	
	public Program7(int size) {
		arr = new int[size];		
	}	
	public void acceptRecord() {
		for ( int i = 0; i< arr.length; i++) {
			System.out.print("Enter element Array["+i+"]:");
			arr[i] = sc.nextInt();
		}		
	}
	public void printRecord() {
		System.out.println("Entered array is : "+Arrays.toString(arr));
		
	}
	public static void main(String[] args) {
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		Program7 arr1 = new Program7(size);
		arr1.acceptRecord();
		arr1.printRecord();
		sc.close();
	}	

}
