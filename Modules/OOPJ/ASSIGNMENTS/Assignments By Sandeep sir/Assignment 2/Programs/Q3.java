public class Q3 {
    public static void main(String[] args) {
                //b
                System.out.println("Bytes used to represent a short: " + Short.BYTES);
                //c
                System.out.println("Minimum value of short: " + Short.MIN_VALUE);
                System.out.println("Maximum value of short: " + Short.MAX_VALUE);
                //d
                short number = 100;
                String strNumber = Short.toString(number);
                System.out.println("Short value as String: " + strNumber);
                //e
                String strNumber = "100";
                short number = Short.parseShort(strNumber);
                System.out.println("String value as short: " + number);
                //f
                String strNumber = "Ab12Cd3";
                short number = Short.parseShort(strNumber);
                System.out.println("String value as short: " + number);
                //g
                short number = 100;
                Short shortWrapper = Short.valueOf(number);
                System.out.println("Short value in wrapper class: " + shortWrapper);
                //h
                String strNumber = "100";
                Short shortWrapper = Short.valueOf(strNumber);
                System.out.println("String value in wrapper class: " + shortWrapper);
                //i
                short number = 100;
                
                int intNumber = number; // Implicit conversion to int
                long longNumber = number; // Implicit conversion to long
                float floatNumber = number; // Implicit conversion to float
                double doubleNumber = number; // Implicit conversion to double
        
                System.out.println("Short as int: " + intNumber);
                System.out.println("Short as long: " + longNumber);
                System.out.println("Short as float: " + floatNumber);
                System.out.println("Short as double: " + doubleNumber);
        
                // Convert other types to short
                int largeInt = 10000;
                short shortFromInt = (short) largeInt; // Explicit conversion (possible data loss)
                System.out.println("Int to short (with possible data loss): " + shortFromInt);
                
    }
    
}
