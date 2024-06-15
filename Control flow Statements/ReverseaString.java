package controlflow;

import java.util.Scanner; 
public class ReverseaString { 
public static void main(String[] args) { 
//scanner statement used to give user defined input 
Scanner scanner = new Scanner(System.in); 
// print statement for user input 
//enter a string 
System.out.print("Enter a string: "); 
String input = scanner.nextLine(); 
// Reverse the string 
String reversed = ""; 
for (int i = input.length() - 1; i >= 0; i--) { 
reversed += input.charAt(i); 
} 
// Print the reversed string 
System.out.println("Reversed string: " + reversed); 
// Close the scanner 
scanner.close(); 
} 
}
