//Pattern 13
//Reverse Right Half Pyramid Pattern

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Value Of N : ");
        int n = scanner.nextInt();

        scanner.close();

        //Call The Mathod From Another Function
        printPattern(n);
    }

    //Algorithm Of Reverse Right Half Pyramid

    public static void printPattern(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
