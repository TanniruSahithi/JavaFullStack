package controlflow;

import java.util.Scanner; 
public class MultiplicationTable { 
public static void main(String[] args) { 
//scanner statement used to give user defined input 
Scanner scanner = new Scanner(System.in); 
// print statement for user input 
//enter a number 
System.out.print("Enter a number: "); 
int number = scanner.nextInt(); 
// Print the multiplication table for the given number 
System.out.println("Multiplication Table for " + number + ":"); 
for (int i = 1; i <= 10; i++) { 
System.out.println(number + " x " + i + " = " + (number * i)); 
} 
// Close the scanner 
scanner.close(); 
} 
} 