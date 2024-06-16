package lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers separated by space:");
        String input = scanner.nextLine();
        
        List<Integer> numbers = Arrays.stream(input.split("\\s+"))
                                      .map(Integer::parseInt)
                                      .collect(Collectors.toList());
        
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        
        System.out.println("Even numbers:");
        evenNumbers.forEach(System.out::println);
        
        scanner.close();
    }
}
