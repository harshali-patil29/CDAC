public class Pattern3 {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 5; 

        for (int i = 1; i<= n; i++) {
            
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j<= (2*i - 1); j++) {
                if (ch <= 'Z') {
                    System.out.print(ch);
                    ch++;
                }
            }
            System.out.println();
        }
    }
}
