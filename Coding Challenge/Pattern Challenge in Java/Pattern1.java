public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i<=6; i++) {
            for (int j = i; j<6; j++) {
				// # to see where the spaces are printing
				//System.out.print("#");
                System.out.print(" ");
            }            
            for (int j = 1; j <= (2*i-1); j++) {
                if (j == 1 || j == (2*i-1) || i == 6) {
                    System.out.print("*");
                } else {
					//System.out.print("#");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
