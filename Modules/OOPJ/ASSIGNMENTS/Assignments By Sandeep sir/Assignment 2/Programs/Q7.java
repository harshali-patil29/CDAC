public class Q7 {
    
    public static void main(String[] args) {
        //b
        int doubleBytes = Double.BYTES;
        System.out.println("Number of bytes used to represent a double value: " + doubleBytes);

        //c
        double minValue = Double.MIN_VALUE;
        double maxValue = Double.MAX_VALUE;
        System.out.println("Minimum value of double: " + minValue);
        System.out.println("Maximum value of double: " + maxValue);

        //d
        double number = 123.456;
        String numberAsString = Double.toString(number);
        System.out.println("Double value as a String: " + numberAsString);

        //e
        String strNumber = "123.456";
        double number = Double.parseDouble(strNumber);
        System.out.println("Converted double value: " + number);

        //f
        String strNumber = "Ab12Cd3";
        double number = Double.parseDouble(strNumber);
        System.out.println("Converted double value: " + number);
        System.out.println("Error: Invalid string format, unable to convert to double.");
        
        //g
        double number = 123.456;
        Double wrapperNumber = Double.valueOf(number);
        System.out.println("Wrapper class value: " + wrapperNumber);

        //h
        String strNumber = "123.456";
        Double wrapperNumber = Double.valueOf(strNumber);
        System.out.println("Wrapper class value: " + wrapperNumber);

        //i
        double num1 = 112.3;
        double num2 = 984.5;
        double sum = Double.sum(num1, num2);
        System.out.println("Sum of the two double values: " + sum);

        //j
        double num1 = 112.2;
        double num2 = 556.6;
        double min = Double.min(num1, num2);
        double max = Double.max(num1, num2);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        //k
        double number = -25.0;
        double sqrt = Math.sqrt(number);
        System.out.println("Square root of -25.0: " + sqrt);

        //l
        double num1 = 0.0;
        double num2 = 0.0;
        double result = num1 / num2;
        System.out.println("Result of dividing 0.0 by 0.0: " + result);

        //m
        double number = 123.456;
        
        int intNumber = (int) number;  
        long longNumber = (long) number;  
        float floatNumber = (float) number;
        
        System.out.println("Converted to int: " + intNumber);
        System.out.println("Converted to long: " + longNumber);
        System.out.println("Converted to float: " + floatNumber);

    }
    
}
