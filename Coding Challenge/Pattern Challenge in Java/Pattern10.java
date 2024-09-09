public class Pattern10 {
    public static void main(String[] args) {
        int n = 7; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || i == 7) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i * j + " ");
                }
            }
            System.out.println();
        }
    }
}