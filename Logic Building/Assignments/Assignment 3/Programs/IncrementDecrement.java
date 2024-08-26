class IncrementDecrement {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int preIncrementResult = ++num1;

       int postDecrementResult = num2--;

        System.out.println("Pre-increment result: " + preIncrementResult);
        System.out.println("Post-decrement result: " + postDecrementResult);
        System.out.println("Updated num1: " + num1);
        System.out.println("Updated num2: " + num2);
    }
}
