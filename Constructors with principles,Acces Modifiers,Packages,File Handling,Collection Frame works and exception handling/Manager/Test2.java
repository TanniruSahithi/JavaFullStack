package constructors;

import constructors.manager.*;

public class Test2 {
    public static void main(String[] args) {
        Manager manager = new Manager("Siva", 20);
        System.out.println("Manager Name: " + manager.getName());
        System.out.println("Manager Age: " + manager.getAge());
    }
}

