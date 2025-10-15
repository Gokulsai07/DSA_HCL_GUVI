// Java Program to print pattern
// Reverse Left Half Pyramid 
import java.util.*;

public class Geeks {
    
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;

        // outer loop to handle rows
        for (i = n; i > 0; i--) {
            
            // inner loop to print spaces.
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            
            // inner loop to print stars.
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[])
    {
        int n = 4;
        printPattern(n);
    }
}