public class NarrowingDemo {
    public static void main(String[] args) {
        double doubleValue = 42.99;
        int intValue = (int) doubleValue;

       
        System.out.println("Double value: " + doubleValue);
        System.out.println("Integer value (after narrowing conversion): " + intValue);
    }
}
