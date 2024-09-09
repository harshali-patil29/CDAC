public class Widening {
    public static void main(String[] args) {
        int intValue = 100;
        
        double doubleValue = intValue;

        float floatValue = intValue;
        String stringValue = String.valueOf(intValue);

        System.out.println("int value: " + intValue);
        System.out.println("int to double: " + doubleValue);
        System.out.println("int to float: " + floatValue);
        System.out.println("int to String: " + stringValue);

        
        boolean booleanValue = (intValue > 0);  
        System.out.println("int to boolean (custom logic): " + booleanValue);
    }
}
