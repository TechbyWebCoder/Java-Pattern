//pattern 3
//Number Increasing pattern

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Number of N :");
        int n = scanner.nextInt();

        scanner.close();

        //call The Function

        printPattern(n);
    }


//Algorithm Of Number Increasing pattern

    public static void printPattern(int n){
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
 
}
