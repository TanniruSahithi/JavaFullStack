package constructors.person;


import java.util.Scanner;

public class AnotherPackageSubclass extends Person {
    public static void main(String[] args) {
        AnotherPackageSubclass person = new AnotherPackageSubclass();

        // Setting values for demonstration
        person.setName("Siva");
        person.setAge(20);
        person.address = "1-59, Pakala";

        // Accessing and printing age and address
        System.out.println("Age: " + person.age); // Accessing age using inheritance
        System.out.println("Address: " + person.address); // Accessing address directly
    }
}
