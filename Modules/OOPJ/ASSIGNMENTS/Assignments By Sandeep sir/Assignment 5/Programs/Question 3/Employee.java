package org.example.employee;

public class Employee {

    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0.0;
    private int id;
    private String name;
    private double salary;

    static {
        totalEmployees = 0;
        totalSalaryExpense = 0.0;
    }
    {
        this.id = 0;
        this.name = "";
        this.salary = 0.0;
    }
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        totalSalaryExpense += salary; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }
    //Update the salary of an individual employee (updateSalary(double newSalary))
    public void updateSalary(double newSalary) {
        totalSalaryExpense -= this.salary; 
        this.salary = newSalary; 
        totalSalaryExpense += newSalary;   
    }
    //Retrieve the total number of employees (getTotalEmployees())
    public static int getTotalEmployees() {
        return totalEmployees;
    }
    //Calculate the total salary expense, including any raises (calculateTotalSalaryExpense())
    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }
    //Apply a percentage raise to the salary of all employees (applyRaise(double percentage))
    public static void applyRaise(double percentage, Employee[] employees) {
        for (Employee employee : employees) {
            double raiseAmount = employee.salary * (percentage / 100);
            employee.updateSalary(employee.salary + raiseAmount); 
        }
    }
    @Override
    public String toString() {
        return "Employee [ID: " + id + ", Name: " + name + ", Salary: ₹" + salary + "]";
    }
    
}
