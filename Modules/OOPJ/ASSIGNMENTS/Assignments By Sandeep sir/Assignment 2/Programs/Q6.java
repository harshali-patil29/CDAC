public class Q6 {
    public static void main(String[] args) {
                //b
                System.out.println("Bytes used to represent a float: " + Float.BYTES);

                //c
                System.out.println("Minimum float value: " + Float.MIN_VALUE);
                System.out.println("Maximum float value: " + Float.MAX_VALUE);
        
                //d
                float number = 123.45f;
                String strNumber = Float.toString(number);
                System.out.println("Float as string: " + strNumber);
        
                //e
                String strNumber = "456.78";
                float number = Float.parseFloat(strNumber);
                System.out.println("String to float: " + number);
        
                //f
                String strNumber = "Ab12Cd3";
                try {
                    float number = Float.parseFloat(strNumber);
                    System.out.println("String to float: " + number);
                } catch (NumberFormatException e) {
                    System.out.println("Exception: " + e);
                }
                
                //g
                float number = 789.12f;
                Float floatWrapper = Float.valueOf(number);
                System.out.println("Float wrapper: " + floatWrapper);
        
                //h
                String strNumber = "123.45";
                Float floatWrapper = Float.valueOf(strNumber);
                System.out.println("String to Float wrapper: " + floatWrapper);
        
                //i
                float num1 = 112.3f;
                float num2 = 984.5f;
                float sum = Float.sum(num1, num2);
                System.out.println("Sum of two floats: " + sum);
        
                //j
                float num1 = 112.2f;
                float num2 = 556.6f;
                System.out.println("Minimum: " + Float.min(num1, num2));
                System.out.println("Maximum: " + Float.max(num1, num2));
        
                //k
                float number = -25.0f;
                double sqrt = Math.sqrt(number);
                System.out.println("Square root of -25.0: " + sqrt);
        
                //l
                float num1 = 0.0f;
                float num2 = 0.0f;
                float result = num1 / num2;
                System.out.println("Result of 0.0 / 0.0: " + result);
        
                //m
                float number = 100.25f;
                
                int intNumber = (int) number;
                double doubleNumber = number;
                long longNumber = (long) number;
                
                System.out.println("Float to int: " + intNumber);
                System.out.println("Float to double: " + doubleNumber);
                System.out.println("Float to long: " + longNumber);
    }
}


