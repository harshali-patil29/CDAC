import java.util.Scanner;
class Prime{
	
	public static boolean isPrime(int n ){
				
		if ( n <= 1 )
			return false;
		if( n == 2 )
			return true;
		
		for( int i = 3; i<n ; i++ ){
			if( n % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		System.out.println(isPrime(n));
	}
}



