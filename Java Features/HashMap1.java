package features;

import java.util.HashMap; 
import java.util.Map; 
public class HashMap1 { 
public static void main(String[] args) { 
// Create a HashMap to store student names and marks 
Map<String, Integer> studentMarks = new HashMap<>(); 
// Adding entries (student names and corresponding marks) 
studentMarks.put("Alice", 85); 
studentMarks.put("Bob", 92); 
studentMarks.put("Carol", 78); 
studentMarks.put("David", 88); 
// Printing all student names and marks 
System.out.println("Student Names and Marks:"); 
for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) { 
System.out.println(entry.getKey() + " : " + entry.getValue()); 
} 
} 
}