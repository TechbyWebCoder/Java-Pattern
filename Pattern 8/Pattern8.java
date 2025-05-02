//Pattern 8
//Rhombus Pattern

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Number Of N :");
        int n = scanner.nextInt();

        scanner.close();

        //Call The Method from another Function
        PrintRhombusPattern(n);
    }

    //Algorithm Of Rhombus Pattern

    public static void PrintRhombusPattern(int n){
        for(int i=1; i<=n; i++){
            for(int s=1; s<i; s++){
                System.out.print(" ");
            }

            for(int j =1;j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
