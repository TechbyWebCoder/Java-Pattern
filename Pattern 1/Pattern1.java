import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the square
        System.out.print("Enter the value of N: ");
        int size = scanner.nextInt(); // Read the integer input

        // Close the scanner to prevent resource leak
        scanner.close();

        // Call the function to print the square pattern
        printPattern(size);
    }

    // Function to print a hollow square pattern
    public static void printPattern(int size) {
        // Loop through rows
        for (int i = 0; i < size; i++) {
            // Loop through columns
            for (int j = 0; j < size; j++) {
                // Print '*' if it's a border cell, otherwise print a space
                if (i == 0 || j == 0 || i == size - 1 || j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after printing one row
            System.out.println();
        }
    }
}
