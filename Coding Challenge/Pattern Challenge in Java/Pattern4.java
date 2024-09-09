public class Pattern4 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Print numbers at the borders or the last row
                if (j == 1 || j == i || i == n) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  "); // Print spaces for hollow part
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
