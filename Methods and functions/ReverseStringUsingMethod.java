package methodfunctions;

import java.util.Scanner;

public class ReverseStringUsingMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println("The reversed string is: " + reversed);

        scanner.close();
    }

    private static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}

