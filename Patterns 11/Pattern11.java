//Pattern 11
//Square Fill Pattern

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter The Value Of N :");
        int n = scanner.nextInt();

        scanner.close();

        //Call The Method From Another Function
        PrintSquare(n);
    }

    //Algorithm Of Square Fill Pattern

    public static void PrintSquare(int n){
        for(int i =1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
