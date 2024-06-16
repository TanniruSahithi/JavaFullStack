package lambdaexpression;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers separated by space:");
        String input = scanner.nextLine();
        
        int[] numbers = Arrays.stream(input.split("\\s+"))
                              .mapToInt(Integer::parseInt)
                              .toArray();
        
        int sumOfSquares = Arrays.stream(numbers)
                                 .map(n -> n * n)
                                 .sum();
        
        System.out.println("Sum of squares: " + sumOfSquares);
        
        scanner.close();
    }
}
