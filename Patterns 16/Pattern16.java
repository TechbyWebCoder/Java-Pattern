//Pattern 16
//Triangle Star Pattern

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Value Of N :");
        int n= scanner.nextInt();

        scanner.close();

        //Call The Method From Another Function
        printPattern(n);
    }

    //Algorithm Of Triangle Star Pattern

    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            //print spaces
            for(int s=1; s<=n-i;s++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
