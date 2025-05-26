//Pattern 12
//Right Half Pyramid Pattern

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Value Of N :");
        int n = scanner.nextInt();

        scanner.close();

        //Call The Method From Another Function
        PrintRighthalfPattern(n);
    }

    //Algorithm Of Right Half Pyramid Pattern

    public static void PrintRighthalfPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
