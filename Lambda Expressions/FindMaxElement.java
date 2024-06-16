package lambdaexpression;

import java.util.Arrays; 
import java.util.List; 
public class FindMaxElement { 
public static void main(String[] args) { 
List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 6); 
// Find the maximum element using a lambda expression 
int maxElement = numbers.stream() 
.max(Integer::compareTo) 
.orElseThrow(); 
// Print the maximum element 
System.out.println("Maximum element: " + maxElement); 
} 
} 