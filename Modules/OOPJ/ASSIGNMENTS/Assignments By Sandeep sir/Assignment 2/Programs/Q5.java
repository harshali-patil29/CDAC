public class Q5 {
    public static void main(String[] args) {
                //b
                System.out.println("Bytes used to represent a long value: " + Long.BYTES);

                //c
                System.out.println("Minimum value of long: " + Long.MIN_VALUE);
                System.out.println("Maximum value of long: " + Long.MAX_VALUE);
                //d
                long number = 12345L;
                String str = Long.toString(number);
                System.out.println("String representation of long: " + str);
                //e
                String strNumber = "12345";
                long number = Long.parseLong(strNumber);
                System.out.println("Long value from String: " + number);
                //f
                String strNumber = "Ab12Cd3";
                try {
                    long number = Long.parseLong(strNumber);
                    System.out.println("Parsed long value: " + number);
                } catch (NumberFormatException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                //g
                long number = 12345L;
                Long longObject = Long.valueOf(number);
                System.out.println("Wrapper class Long object: " + longObject);
                //h
                String strNumber = "12345";
                Long longObject = Long.valueOf(strNumber);
                System.out.println("Wrapper class Long object from String: " + longObject);
                //i
                long num1 = 1123L;
                long num2 = 9845L;
                long sum = Long.sum(num1, num2);
                System.out.println("Sum of two long values: " + sum);
                //j
                long num1 = 1122L;
                long num2 = 5566L;
                long min = Long.min(num1, num2);
                long max = Long.max(num1, num2);
                System.out.println("Minimum value: " + min);
                System.out.println("Maximum value: " + max);
                //k
                long number = 7L;
                System.out.println("Binary representation: " + Long.toBinaryString(number));
                System.out.println("Octal representation: " + Long.toOctalString(number));
                System.out.println("Hexadecimal representation: " + Long.toHexString(number));
                //l
                long number = 100L;
                
                // Convert long to int
                int intValue = (int) number;
                System.out.println("Long to int: " + intValue);
                
                // Convert long to float
                float floatValue = (float) number;
                System.out.println("Long to float: " + floatValue);
                
                // Convert int to long
                int anotherInt = 50;
                long longValueFromInt = (long) anotherInt;
                System.out.println("Int to long: " + longValueFromInt);
        
        
}
}
