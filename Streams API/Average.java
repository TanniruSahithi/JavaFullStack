package api;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter integers separated by space:");
        String input = scanner.nextLine();
        
        List<Integer> list = Arrays.stream(input.split("\\s+"))
                                   .map(Integer::parseInt)
                                   .collect(Collectors.toList());
        
        double average = list.stream()
                             .mapToInt(Integer::intValue)
                             .average()
                             .orElse(0);
        
        System.out.println("Average of the integers: " + average);
    }
}
