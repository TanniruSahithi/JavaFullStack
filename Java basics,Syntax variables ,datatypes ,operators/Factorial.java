package javafeatures;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    private static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
}

