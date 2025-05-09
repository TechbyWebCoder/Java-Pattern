//Pattern 9
//Diamond Star Pattern

import java.util.*;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The NUmber Of N :");
        int n = scanner.nextInt();

        scanner.close();

        //Call The Method From Another Function
        printDiamond(n);
    }

    //Algorithm Of Diamond Star Pattern

    public static void printDiamond(int n){
        for(int i =1; i<=n; i++){
            for(int s=1; s<=n-i; s++){
                System.out.print(" ");
            }

            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n-1; i>=1; i--){
            for(int s=1;s<=n-i; s++){
                System.out.print(" ");
            }

            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
