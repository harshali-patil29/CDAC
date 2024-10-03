import java.util.Scanner;

class Unique {
    public static Character nonRepeatedChar(String str) {
        int n = str.length(); 
        boolean found = false;  
        for (int i = 0; i < n; ++i) {
            found = true;

            for (int j = 0; j < n; j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    found = false;
                    break;  
                }
            }
            if (found) {
                return str.charAt(i);  
            }
        }
        return null;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(nonRepeatedChar(str));
		
        sc.close();
    }
}
