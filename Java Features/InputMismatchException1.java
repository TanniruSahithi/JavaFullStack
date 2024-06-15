package features;

import java.util.InputMismatchException; 
import java.util.Scanner; 
public class InputMismatchException1 { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
try { 
System.out.print("Enter an integer: "); 
int num = scanner.nextInt();   // Read an integer from user input 
System.out.println("Entered number: " + num); 
} catch (InputMismatchException e) { 
System.out.println("Error: Input must be an integer"); 
} finally { 
scanner.close();   // Close the Scanner in the finally block 
} 
} 
}