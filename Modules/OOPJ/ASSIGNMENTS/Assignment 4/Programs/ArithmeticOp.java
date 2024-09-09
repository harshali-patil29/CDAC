public class ArithmeticOp {
    public static void main(String[] args) {
        int intValue = 5;
        double doubleValue = 10.5;
        float floatValue = 3.2f;

        double result1 = intValue + doubleValue;  // int is converted to double
        float result2 = floatValue + intValue;    // int is converted to float
        double result3 = floatValue + doubleValue; // float is converted to double

       System.out.println("int + double = " + result1);   // Widening: int -> double
        System.out.println("float + int = " + result2);    // Widening: int -> float
        System.out.println("float + double = " + result3); // Widening: float -> double
    }
}
