class Student {
    
    String name;
    int age;
    String grade;    

    public Student(String name, int age, String grade) { //parameterized constr
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class Program4 {
    public static void main(String[] args) {
        
        Student student = new Student("Sam", 24, "A");
        student.displayDetails();
    }
}
