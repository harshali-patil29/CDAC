import java.util.Scanner;
class Fibo{
	
	public static void fibo(int n ){		
		int prev=0, next=1,current;
		
		if(n>=1)
			System.out.println(prev);
		if(n>=2)
			System.out.println(next);
		for( int i = 3; i<=n; i++ ){
			current = prev+next;
			System.out.println(current);
			prev = next;
			next = current;
		}		
	}
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		fibo(n);
	}
}






