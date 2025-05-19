// Pattern 10
//Butterfly Star Pattern

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Number Of N :");
        int n = scanner.nextInt();

        scanner.close();


            //Call The Method fron Another Function
            printButterfly(n);
    }

    //Algorithm Of Butterfly Star Pattern

    public static void printButterfly(int n){

        //upper half
        for(int i=1; i<=n; i++){
            //left star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces
            for(int s=1;s<=2*(n-i);s++){
                System.out.print(" ");
            }

            //right star
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //lower half
            for(int i=n; i>=1; i--){
                //left star
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }

                //spaces
                for(int s=1; s<=2*(n-i);s++){
                    System.out.print(" ");
                }

                //right star
                for(int j=1;j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}
