class Fibonacci {
    public static void main(String[] args) {
        int n = 21; // The number up to which we want to print the sequence
        int first = 0;
        int second = 1;

        System.out.print(first + " " + second + " "); // Print the initial two numbers

        for (int i = 2; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
