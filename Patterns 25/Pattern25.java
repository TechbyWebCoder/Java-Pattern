// Pattern 25
// K Pattern

import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of N : ");
        int n = scanner.nextInt();
        scanner.close();

        //Call The Method From Another Function
        printKPattern(n);
    }

    //Algorithm Of K Pattern

    public static void printKPattern(int n) {
        int totalRows = 2 * n - 1;

        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i < n && j == n - i - 1) || (i >= n && j == i - n + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
