// Base class: Vehicle
class Vehicle {
    protected String make;
    protected int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getDetails() {
        return "Make: " + make + "\nYear: " + year;
    }
}

// Derived class: Car
class Car extends Vehicle {
    private String model;

    public Car(String make, int year, String model) {
        super(make, year);
        this.model = model;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "\nModel: " + model;
    }
}

public class Program2 {
    public static void main(String[] args) {
        Car car = new Car("Maruti Suzuki", 2024, "Corolla");
        System.out.println(car.getDetails());
    }
}
