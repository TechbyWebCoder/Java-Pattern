//Pattern 21
//Hollow diamond  pyramid Pattern 

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Value of N :");
        int n = scanner.nextInt();

        scanner.close();

        // Call The Method From Another Function
        printpattern(n);

    }

    //Algorithm Of Hollow Diamond Pyramid Pattern

    public static void printpattern(int n){
        //upper half of the diamond
        for(int i=1; i<=n ; i++){
            for(int s=1; s<=n-i; s++){
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i-1); j++){
                if(j==1 || j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        //lower half of the diamond

        for(int i=n ; i>=1; i--){
            for (int s=1; s<=n-i ; s++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                if(j==1 || j== 2*i-1){
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
