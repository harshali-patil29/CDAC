public class Pattern8 {
    public static void main(String[] args) {
        
        int n = 5;
        System.out.println("0");
        for (int i = 0; i < n; i++) {
            // Print the first part (increasing numbers)
            for (int j = n - i; j < n; j++) {
                System.out.print(j);
            }

            // Print the middle "505" part
            System.out.print("505");

            // Print the second part (decreasing numbers)
            for (int j = n - 1; j >= n - i; j--) {
                System.out.print(j);
            }

            System.out.println(); 
        }

       
    }
}
