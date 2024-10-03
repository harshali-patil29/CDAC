import java.util.Scanner;

public class Repeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] carray = str.toCharArray();
        boolean[] printed = new boolean[256]; 
        for (int i = 0; i < str.length(); i++) {
            if (!printed[carray[i]]) { 
                for (int j = i + 1; j < str.length(); j++) {
                    if (carray[i] == carray[j]) {
                        System.out.print(carray[j] + " ");
                        printed[carray[i]] = true; 
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}