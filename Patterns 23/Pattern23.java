//Pattern 23
//Pascal's triangle Pattern

import java.util.Scanner;

public class Pattern23 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Value Of N : ");
        int n = scanner.nextInt();

        scanner.close();

        //Call The Method From another function
        printpattern(n);
    }

    //algorithm Of Pascal's Triangle Pattern

    public static void  printpattern(int n){
        for(int i =0; i<n; i++){
            //print leading spaces for formatting
            for(int s=0; s<n-i-1; s++){
                System.out.print(" ");
            }

            int num =1; 
            for(int j=0; j<=i; j++){
                System.out.print(num + " ");
                num = num *(i-j)/ (j+1);
            }
            System.out.println();
        }
    }
}
