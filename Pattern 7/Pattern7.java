//Pattern 7
//Palindrome Triangle Pattern

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Number Of N :");
        int n = scanner.nextInt();

        scanner.close();

        //Call The Mathod From Another Function
        printPalindromePattern(n);

    }

    //Algorithm Of Palindrome Triangle Pattern

    public static void printPalindromePattern(int n){
        for(int i=1; i<=n; i++){
            for(int s=1; s<=n-i; s++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print(j);
            }

            for(int j=i-1; j>=1; j--){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
