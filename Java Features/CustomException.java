package features;

import java.util.Scanner; 
//Custom Exception class 
class InvalidAgeException extends Exception { 
public InvalidAgeException(String message) { 
super(message); 
} 
} 
public class CustomException { 
//Method to validate age and throw InvalidAgeException if age is less than 18 
public static void validateAge(int age) throws InvalidAgeException { 
if (age < 18) { 
throw new InvalidAgeException("Age cannot be less than 18"); 
} else { 
System.out.println("Valid age: " + age); 
} 
} 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
try { 
System.out.print("Enter your age: "); 
int age = scanner.nextInt();   // Read age from user input 
validateAge(age);              
//Validate the entered age 
} catch (InvalidAgeException e) { 
System.out.println("Invalid Age: " + e.getMessage()); 
} catch (Exception e) { 
System.out.println("Error: " + e.getMessage()); 
} finally { 
scanner.close();   // Close the Scanner in the finally block 
} 
} 
}