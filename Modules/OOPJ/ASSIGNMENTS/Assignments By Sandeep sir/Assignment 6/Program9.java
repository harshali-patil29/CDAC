import java.util.Scanner;

public class Program9 {
    private char[][] seats;  
    private int rows, columns;
    public static Scanner sc = new Scanner(System.in);

    public Program9(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        seats = new char[rows][columns]; 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = 'A';  //A = available
            }
        }
    }

    public void displaySeatingChart() {
        System.out.println("Current seating chart:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();  
        }
    }

    // Method to book a seat
    public void bookSeat(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= columns) {
            System.out.println("Invalid seat position!");
        } else if (seats[row][col] == 'X') {
            System.out.println("Seat is already booked.");
        } else {
            seats[row][col] = 'X';  // 'X' indicates the seat is booked
            System.out.println("Seat booked successfully.");
        }
    }

    // Method to cancel a booking
    public void cancelSeat(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= columns) {
            System.out.println("Invalid seat position!");
        } else if (seats[row][col] == 'A') {
            System.out.println("Seat is already available.");
        } else {
            seats[row][col] = 'A';  // Mark the seat as available again
            System.out.println("Booking cancelled successfully.");
        }
    }

    // Method to check seat availability
    public boolean checkSeatAvailability(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= columns) {
            System.out.println("Invalid seat position!");
            return false;
        }
        if (seats[row][col] == 'A') {
            System.out.println("Seat is available.");
            return true;
        } else {
            System.out.println("Seat is occupied.");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        // Initialize the seating arrangement
        Program9 airplane = new Program9(rows, columns);
        
        // Menu-driven program for seat booking system
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display Seating Chart");
            System.out.println("2. Book a Seat");
            System.out.println("3. Cancel a Booking");
            System.out.println("4. Check Seat Availability");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    airplane.displaySeatingChart();
                    break;
                case 2:
                    System.out.print("Enter row to book: ");
                    int bookRow = sc.nextInt();
                    System.out.print("Enter column to book: ");
                    int bookCol = sc.nextInt();
                    airplane.bookSeat(bookRow - 1, bookCol - 1);  
                    break;
                case 3:
                    System.out.print("Enter row to cancel: ");
                    int cancelRow = sc.nextInt();
                    System.out.print("Enter column to cancel: ");
                    int cancelCol = sc.nextInt();
                    airplane.cancelSeat(cancelRow - 1, cancelCol - 1);  
                    break;
                case 4:
                    System.out.print("Enter row to check: ");
                    int checkRow = sc.nextInt();
                    System.out.print("Enter column to check: ");
                    int checkCol = sc.nextInt();
                    airplane.checkSeatAvailability(checkRow - 1, checkCol - 1);  
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
