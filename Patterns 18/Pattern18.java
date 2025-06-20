//Pattern 18
//Mirror Image Triangle Pattern

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Value Of N :");
        int n = scanner.nextInt();

        scanner.close();

        //Call The Method From Another Function
        printpattern(n);
    }

    //Algorithm Of Mirror Image Triangle Pattern

    public static void printpattern(int n){
        for(int i=1; i<=n; i++){
            //print spaces
            for(int s=1;s<=n; s++){
                System.out.print(" ");
            }
            //print stars after spaces
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
