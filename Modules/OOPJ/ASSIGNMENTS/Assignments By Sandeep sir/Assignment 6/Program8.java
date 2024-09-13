import java.util.Arrays;
import java.util.Scanner;

public class Program8 {
	int[] arr;
	public static Scanner sc = new Scanner(System.in);
	
	public Program8(int size) {
		arr = new int[size];		
	}	
	public int[] getArr() {		
		return arr;
	}
	public int[] setArr() {
		
		for ( int i = 0; i< arr.length; i++) {
			System.out.print("Enter element Array["+i+"]:");
			arr[i] = sc.nextInt();
		}
		return arr;		
	}
	public static void main(String[] args) {
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		Program8 arr1 = new Program8(size);
		arr1.setArr();
		System.out.println("Entered array is : "+Arrays.toString(arr1.getArr()));
		sc.close();
	}	
}
