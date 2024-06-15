package controlflow;

import java.util.Scanner; 
public class SumOfNaturalNumbers { 
public static void main(String[] args) { 
//scanner statement used to give user defined input 
Scanner scanner = new Scanner(System.in); 
// print statement for user input 
//enter a number 
System.out.print("Enter a number: "); 
int n = scanner.nextInt(); 
// Calculate the sum of first n natural numbers 
int sum = 0; 
for (int i = 1; i <= n; i++) { 
sum += i; 
} 
// Print the sum of first n natural numbers 
System.out.println("The sum of first " + n + " natural numbers is: " + 
sum); 
// Close the scanner 
scanner.close(); 
} 
} 