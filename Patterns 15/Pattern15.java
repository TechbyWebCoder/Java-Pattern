//Pattern 15
//Reverse Left Half Pyramid Pattern 

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter The Value Of N: ");
        int n = scanner.nextInt();

        scanner.close();

        //Call The Method From Another Function
        PrintPattern(n);

    }

    //Algorithm Of Reverse Left Pyramid Pattern

    public static void PrintPattern(int n){
        for(int i=1; i<=n; i++){
            //print spaces
            for(int s=1; s<i; s++){
                System.out.print(" ");
            }

            //print stars
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
