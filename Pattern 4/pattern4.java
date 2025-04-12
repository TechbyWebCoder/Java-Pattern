//pattern 4
//Number Increasing Reverse pattern

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of N : ");
        int n = scanner.nextInt();

        scanner.close(); 

        // Call the pattern method from another class
        printReverseNumberPyramid(n);
    }

    //Algorithm Of Number Increasing pattern


    public static void printReverseNumberPyramid(int rows) {
        for (int i = rows; i >= 1; i--) { // Loop from rows down to 1
            for (int j = 1; j <= i; j++) { // Print numbers from 1 to i
                System.out.print(j);
            }
            System.out.println(); // Move to next line
        }
    }
}
