package api;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter strings separated by space:");
        String input = scanner.nextLine();
        
        List<String> list = Arrays.asList(input.split("\\s+"));
        
        list.stream()
            .filter(s -> s.startsWith("A"))
            .forEach(System.out::println);
        
        scanner.close();
    }
}
