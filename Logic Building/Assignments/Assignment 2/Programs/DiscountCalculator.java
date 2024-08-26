import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total purchase amount: Rs. ");
        double totalPurchase = scanner.nextDouble();


        System.out.print("Do you have a membership card? (yes/no): ");
        String membership = scanner.next();


        double discount = 0.0;

        if (totalPurchase >= 1000) {
            discount = 20.0;
        } else if (totalPurchase >= 500) {
            discount = 10.0;
        } else {
            discount = 5.0;
        }


        if (membership.equalsIgnoreCase("yes")) {
            discount += 5.0;
        }


        double discountAmount = (discount / 100) * totalPurchase;
        double finalPrice = totalPurchase - discountAmount;

        System.out.println("Total Purchase Amount: Rs. " + totalPurchase);
        System.out.println("Discount Applied: " + discount + "%");
        System.out.println("Discount Amount: Rs. " + discountAmount);
        System.out.println("Final Price: Rs. " + finalPrice);

        scanner.close();
    }
}
