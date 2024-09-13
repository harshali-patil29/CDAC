public class Program6 {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 4, 5, 6};  
        int N = 6;  
        
        int expectedSum = N * (N + 1) / 2;
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
       
        System.out.println("The missing number is: " + missingNumber);
    }
}

