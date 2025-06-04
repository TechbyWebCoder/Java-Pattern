//Pattern 14
//Left half Pyramid Pattern

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter The Value Of N :");
        int n = scanner.nextInt();

        scanner.close();

        //Call The Method From another Function
        Printpattern(n);
    }

    //Algorithm Of Left Half pyramid Pattern

    public static void Printpattern(int n){
        for(int i=1; i<=n; i++){
            //print spaces
            for(int s=1; s<=n-i; s++){
                System.out.print(" ");
            }

            //Print Stars
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
