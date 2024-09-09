public class WideningDemo {
    public static void main(String[] args) {
        int intValue = 42;

        double doubleValue = intValue;

        System.out.println("Integer value: " + intValue);
        System.out.println("Double value (after widening conversion): " + doubleValue);
    }
}
