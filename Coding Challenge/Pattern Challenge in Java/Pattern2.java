public class Pattern2 {
    public static void main(String[] args) { 
        for (int i = 7; i >= 1; i--) {
            // Print leading spaces
            for (int j = 7; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars and spaces for hollow inverted pyramid
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == 1 || i == 7) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
