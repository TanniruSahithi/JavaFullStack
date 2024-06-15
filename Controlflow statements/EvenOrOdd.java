package controlflow;

import java.util.Scanner; 
public class EvenOrOdd { 
public static void main(String[] args) { 
//scanner statement used to give user defined input 
Scanner scanner = new Scanner(System.in); 
// print statement for user input 
// enter a number 
System.out.print("Enter a number: "); 
int number = scanner.nextInt(); 
// Check if the number is even or odd 
if (number % 2 == 0) { 
System.out.println("Even"); 
} else { 
System.out.println("Odd"); 
} 
} 
} 
