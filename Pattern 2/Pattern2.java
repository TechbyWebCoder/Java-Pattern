//Pattern 2
//Number Triangular Pattern

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter The Value Of N :");
        int  n =scanner.nextInt();

        scanner.close();

        printPattern(n);// Call the Printpattern Function

    }

    //Algorithm Of Number Triangular Pattern

    public static void printPattern(int n){
        for(int i =1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
