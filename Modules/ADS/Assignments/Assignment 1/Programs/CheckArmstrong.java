import java.util.Scanner;
class CheckArmstrong{
	
	public static boolean isArmstrong(int n ){
		boolean b = false;
		int originalno = 0 , rem, res = 0;
		originalno = n;
		while( n != 0){
			
			rem = n % 10;
			res = res + (int)Math.pow(rem,3);
			n = n /10;	
			
		}		
		if ( originalno == res )
			b = true;
		else 
			b = false;
		return b;
	}
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		System.out.println(isArmstrong(n));
	}
}

