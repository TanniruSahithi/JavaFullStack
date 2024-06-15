package controlflow;

import java.util.Scanner; 
public class LargestNumber { 
public static void main(String[] args) { 
//scanner statement used to give user defined input 
Scanner scanner = new Scanner(System.in); 
// print statement for user input 
//enter first number  
System.out.print("Enter first number: "); 
int num1 = scanner.nextInt(); 
//enter second number 
System.out.print("Enter second number: "); 
int num2 = scanner.nextInt(); 
//enter third number 
System.out.print("Enter third number: "); 
int num3 = scanner.nextInt(); 
// Determine the largest number using and(&&) operator 
int largest; 
if (num1 >= num2 && num1 >= num3) { 
largest = num1; 
} else if (num2 >= num1 && num2 >= num3) { 
largest = num2; 
} else { 
largest = num3; 
} 
// Print the largest number among the three numbers 
System.out.println("The largest number is: " + largest); 
// Close the scanner 
scanner.close(); 
} 
}