import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade for subject 1: ");
        int grade1 = scanner.nextInt();
        System.out.print("Enter the grade for subject 2: ");
        int grade2 = scanner.nextInt();
        System.out.print("Enter the grade for subject 3: ");
        int grade3 = scanner.nextInt();

        int failedSubjects = 0;

        if (grade1 <= 40) {
            failedSubjects++;
        }
        if (grade2 <= 40) {
            failedSubjects++;
        }
        if (grade3 <= 40) {
            failedSubjects++;
        }

       if (failedSubjects == 0) {
            System.out.println("The student has passed.");
        } else {
            System.out.println("The student has failed in " + failedSubjects + " subject.");
        }

        scanner.close();
    }
}
