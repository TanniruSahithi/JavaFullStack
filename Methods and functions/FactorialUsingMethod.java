package methodfunctions;

import java.util.Scanner;

public class FactorialUsingMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to calculate its factorial:");
        int number = scanner.nextInt();

        int result = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + result);

        scanner.close();
    }

    private static int calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Factorial of 0 is 1
        }

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}