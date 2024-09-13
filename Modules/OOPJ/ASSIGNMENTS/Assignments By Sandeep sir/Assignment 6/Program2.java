import java.util.Scanner;

public class Program2 {
	private static Scanner sc = new Scanner( System.in ); 
	
	public static void acceptRecord(int[] arr ) {
		if ( arr != null) {
			for( int i = 0; i < arr.length; i++ ) {
				System.out.print("Enter element [ "+i+" ] : ");
				arr [ i ] = sc.nextInt();
			}
		}
	}		
	public static void printRecord( int[] arr ){ 
	if( arr != null ){ 
	System.out.print("Array: [ ");
	for( int i = 0; i < arr.length; i++ ){ 
	        System.out.print(arr [i]+" "); 
			} 
		System.out.println("]"); 
		} 
	
	}	
	public static void main(String[] args) {
		int[] arr = new int[5];		
		Program2.acceptRecord(arr);
		Program2.printRecord(arr);
		sc.close();	
}
}
