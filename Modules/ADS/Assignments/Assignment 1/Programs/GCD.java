import java.util.Scanner;
class GCD{	
	public static void gcd(int a,int b ){		
		
			while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
		
	}
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();	
		int n2 = sc.nextInt();
		gcd(n1,n2);
	}
}






