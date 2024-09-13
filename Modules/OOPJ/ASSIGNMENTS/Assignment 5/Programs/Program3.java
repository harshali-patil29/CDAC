// Base class Animal
class Animal {
    String name;
    // Constructor
    public Animal(String name) {
        this.name = name;
    }
    // Methods
    public void eat() {
        System.out.println(name + " is eating.");
    }
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {

    // Constructor
    public Dog(String name) {
        super(name); 
    }
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Program3 {
    public static void main(String[] args) {
        
        Animal animal = new Animal("Generic Animal");
        animal.eat();  
        animal.sleep();  

        Dog dog = new Dog("Buddy");
        dog.eat();  
        dog.sleep();  
        dog.bark();  
}
}