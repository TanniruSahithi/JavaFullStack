package lambdaexpression;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringsDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter strings separated by space:");
        String input = scanner.nextLine();
        
        String[] strings = input.split("\\s+");
        
        Arrays.sort(strings, (a, b) -> b.compareTo(a));
        
        System.out.println("Strings sorted in descending order:");
        for (String s : strings) {
            System.out.println(s);
        }
        
        scanner.close();
    }
}

