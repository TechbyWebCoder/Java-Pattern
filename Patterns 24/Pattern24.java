//Pattern 24
//Right Pascal's Triangle Pattern 

import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Value Of N:");
        int n = scanner.nextInt();

        scanner.close();

        //Call The Method from Another Function
        printpattern(n);
    }
    //algorithm Of Right Pascal's Triangle Pattern

    public static void printpattern(int n){
        //Upper Half of the triangle
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lowerb Half Of The Triangle
        for(int i= n-1; i>=1; i--){
        for(int j =1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
