import java.util.Scanner;
public class Program3 {
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
	public static void maxInArray(int[] arr){
		if( arr != null ){ 
			int max=arr[0];
			for( int i = 0; i < arr.length; i++ ){ 
				if( arr[0] < arr[i] ) {
					max = arr[i];					
				}			        
			} 
			System.out.println("Maximum in an array is "+ max); 
		}		
	}
	public static void main(String[] args) {
		int[] arr = new int[5];		
		Program3.acceptRecord(arr);
		Program3.printRecord(arr);
		Program3.maxInArray(arr);
		sc.close();	
}
}