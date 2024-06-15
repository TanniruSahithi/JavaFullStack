package features;

import java.util.ArrayList; 
public class ArrayList1 { 
public static void main(String[] args) { 
// Create an ArrayList with mixed data types 
ArrayList<Object> list = new ArrayList<>(); 
// Adding elements of different data types 
list.add(10);        // Integer 
list.add("Hello");  // String     
list.add(3.14);    // Double       
list.add(true);    // Boolean       
// Printing all elements in the ArrayList 
System.out.println("Elements in the ArrayList:"); 
for (Object element : list) { 
System.out.println(element); 
} 
} 
} 