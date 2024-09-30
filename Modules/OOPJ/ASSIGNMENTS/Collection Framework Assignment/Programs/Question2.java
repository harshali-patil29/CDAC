package org.example.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Question2 {
    public static void main(String[] args) {
    	
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ana", 30));
        people.add(new Person("Minal", 25));
        people.add(new Person("Chia", 30));
        people.add(new Person("Devi", 20));
        people.add(new Person("Archie", 25));
        
       Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                // Compare by age
                int ageComparison = Integer.compare(p1.getAge(), p2.getAge());
                if (ageComparison == 0) {
                    // If ages are equal, compare by name
                    return p1.getName().compareTo(p2.getName());
                }
                return ageComparison;
            }
        });
        
        System.out.println("Sorted list of people:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
