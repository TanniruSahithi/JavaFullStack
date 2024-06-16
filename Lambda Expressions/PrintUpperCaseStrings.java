package lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintUpperCaseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter strings separated by space:");
        String input = scanner.nextLine();
        
        List<String> strings = Arrays.asList(input.split("\\s+"));
        
        List<String> upperCaseStrings = strings.stream()
                                               .map(String::toUpperCase)
                                               .collect(Collectors.toList());
        
        System.out.println("Strings in uppercase:");
        upperCaseStrings.forEach(System.out::println);
        
        scanner.close();
    }
}
