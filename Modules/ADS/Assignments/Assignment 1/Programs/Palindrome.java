import java.util.Scanner;
class Palindrome{
	public static boolean isPalidrome(int n){
	
		boolean p = false;
		int temp = n,rem=0,res=0;
		if(n<0){
			p=false;
			return p;
		}
		while(n!=0){
			rem = n % 10;
			res = res * 10 + rem;
			n = n /10;	
		}
		if(temp == res)
			p = true;
		else
			p = false;
		return p;
	}	
	public static void main( String[] args ){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPalidrome(n));
	}
}

