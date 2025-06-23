//Pattern 19
//Hollow Triangle Pattern

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Value Of N : ");
        int n = scanner.nextInt();

        scanner.close();

        //Call The Method From Another Function
        printpattern(n);

    }

    //Algorithm Of Hollow Triangle Pattern

    public static void printpattern(int n){
        for(int i=1; i<=n; i++){
            //print leading spaces
            for(int s=1; s<=n; s++){
                System.out.print(" ");
            }
            //print pattern with hollow
            for(int j=1; j<=(2*i-1); j++){
                if(j==1 || j==(2*i-1) || i==n){
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
