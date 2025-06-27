//Pattern 20
// Hollow Reverse Triangle Pattern

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter The value Of N : ");
        int n = scanner.nextInt();

        scanner.close();

        //Call The Method From Another Function
        printpattern(n);

    }

    //Algorithm Of Hollow Reverse Triangle Pattern

    public static void printpattern(int n){
        for(int i =n; i>=1; i--){
            //print leading pattern
            for(int s=1; s<=n; s++){
                System.out.print(" ");
            }

            //print hollow star
            for(int j=1; j<=(2*i-1) ; j++){
                if(j==1|| j==(2*i-1) || i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
