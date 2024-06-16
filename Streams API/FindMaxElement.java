package api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindMaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter integers separated by space:");
        String input = scanner.nextLine();
        
        List<Integer> list = Arrays.stream(input.split("\\s+"))
                                   .map(Integer::parseInt)
                                   .collect(Collectors.toList());
        
        Optional<Integer> maxElement = list.stream().max(Integer::compare);
        
        maxElement.ifPresent(max -> System.out.println("Maximum element: " + max));
    }
}
