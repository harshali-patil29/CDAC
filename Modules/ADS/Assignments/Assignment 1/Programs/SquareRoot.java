import java.util.Scanner;
public class SquareRoot {
	public static int Squareroot(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int start = 1, end = x, result = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == x) {
                return mid;
            }
            if (mid * mid < x) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(Squareroot(x));
    }   
}