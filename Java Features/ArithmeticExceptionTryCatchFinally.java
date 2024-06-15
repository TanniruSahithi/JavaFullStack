package features;

import java.util.Scanner; 
public class ArithmeticExceptionTryCatchFinally { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
try { 
System.out.print("Enter the numerator: "); 
int numerator = scanner.nextInt(); 
System.out.print("Enter the denominator: "); 
int denominator = scanner.nextInt(); 
int result = numerator / denominator; 
System.out.println("Result: " + result); 
} catch (ArithmeticException e) { 
System.out.println("Error: Division by zero"); 
} catch (Exception e) { 
System.out.println("Error: " + e.getMessage()); 
} finally { 
System.out.println("Inside finally block"); 
scanner.close(); // Closing the Scanner in the finally block 
} 
} 
} 
