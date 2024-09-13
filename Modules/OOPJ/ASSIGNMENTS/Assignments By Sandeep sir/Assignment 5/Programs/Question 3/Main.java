package org.example.employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = {
            new Employee(101, "John", 50000),
            new Employee(102, "Shyam", 60000),
            new Employee(103, "Priti", 55000)
        };
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display all employees");
            System.out.println("2. Apply a raise to all employees");
            System.out.println("3. Display total number of employees");
            System.out.println("4. Display total salary expense");
            System.out.println("5. Update an employee's salary");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (Employee emp : employees) {
                        System.out.println(emp);
                    }
                    break;

                case 2:
                    System.out.println("Enter percentage raise: ");
                    double percentage = scanner.nextDouble();
                    Employee.applyRaise(percentage, employees);
                    System.out.println("Raise applied to all employees.");
                    break;

                case 3:
                    System.out.println("Total employees: " + Employee.getTotalEmployees());
                    break;

                case 4:
                    System.out.println("Total salary expense: ₹" + Employee.calculateTotalSalaryExpense());
                    break;

                case 5:
                    System.out.println("Enter employee ID to update salary: ");
                    int id = scanner.nextInt();
                    System.out.println("Enter new salary: ");
                    double newSalary = scanner.nextDouble();
                    for (Employee emp : employees) {
                        if (emp.getId() == id) {
                            emp.updateSalary(newSalary);
                            System.out.println("Salary updated for employee ID: " + id);
                            break;
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting program.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
        
        
    }
    
}
