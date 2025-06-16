//Pattern 17
//Reverse Number Triangle Pattern 

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter The Value Of N :");
        int n =  scanner.nextInt();

        scanner.close();

        //Call The Method From Another Function
        printPattern(n);
    }

    //Algorithm Of Reverse Number Triangle Pattern
    public static void printPattern(int n){
        for(int i=n; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
    }
    }
    
}
