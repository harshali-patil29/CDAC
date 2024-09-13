import java.util.Arrays;
import java.util.Scanner;

public class Program4 {
	private static Scanner sc = new Scanner( System.in ); 	
	public static void acceptRecord(int[] arr ) {
		if ( arr != null) {
			for( int i = 0; i < arr.length; i++ ) {
				System.out.print("Enter element [ "+i+" ] : ");
				arr [ i ] = sc.nextInt();
			}
		}
	}		
	public static int[] removeDuplicate(int[] arr) {
		Arrays.sort(arr);
        int[] uniqueArray = new int[arr.length];
        int j = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                uniqueArray[j++] = arr[i];
            }
        }
        uniqueArray[j++] = arr[arr.length - 1];
        uniqueArray = Arrays.copyOf(uniqueArray, j);
        
        return uniqueArray;
        }
	
	public static void showRecord(int[] uniqueArray) {
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
	}	
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] newArr = new int[5];
        Program4.acceptRecord(arr);
        newArr = Program4.removeDuplicate(arr);
        Program4.showRecord(newArr);        
    }
}
