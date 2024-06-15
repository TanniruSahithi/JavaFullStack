package javafeatures;

import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // enter length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        
        // enter width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        
        // Close the scanner
        scanner.close();
        
        // Calculate the area of the rectangle
        double area = length * width;
        
        // Display the result
        System.out.println("The area of the rectangle is: " + area);
    }
}
