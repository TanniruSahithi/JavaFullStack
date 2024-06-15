package javafeatures;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Initialize the first two terms
        int a = 0, b = 1, next;

        // Print the Fibonacci series up to n terms
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            // Calculate the next term
            next = a + b;
            // Update a and b for the next iteration
            a = b;
            b = next;
        }
    }
}
