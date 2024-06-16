package api;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MapIntegersToSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter integers separated by space:");
        String input = scanner.nextLine();
        
        List<Integer> list = Arrays.stream(input.split("\\s+"))
                                   .map(Integer::parseInt)
                                   .collect(Collectors.toList());
        
        list.stream()
            .map(n -> n * n)
            .forEach(System.out::println);
    }
}

