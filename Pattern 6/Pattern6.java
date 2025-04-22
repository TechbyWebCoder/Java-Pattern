//Pattern 6
//Zero One Triangle Pattern

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Number Of N :");
        int n = scanner.nextInt();

        scanner.close();

        //Call The Method From Another Function
        printZeroOnePattern(n);
    }

    //Algorithm Of Zero One Triangle Pattern

    public static void printZeroOnePattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if ((i+j)% 2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    
}
