package javafeatures;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // enter second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Display original numbers
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swap without using a temporary variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        // Display swapped numbers
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}
