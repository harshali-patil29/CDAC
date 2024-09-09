public class Pattern9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            // Generate the increasing number sequence
            String numSequence = "";
            for (int j = 1; j <= i; j++) {
                numSequence += j;
            }
            
            // Calculate the result of the pattern
            int result = Integer.parseInt(numSequence) * 8 + i;
            
            // Print the pattern
            System.out.println(numSequence + " x 8 + " + i + " = " + result);
        }
    }
}
