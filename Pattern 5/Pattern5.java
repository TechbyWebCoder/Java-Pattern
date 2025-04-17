//Pattern 5
//Number Changing Pyramid Pattern

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Number Of N :");
        int n= scanner.nextInt();

        scanner.close();

        //Call the Method From Another function
        printPattern(n);
    }    

    //Algorithm Of Number Changing Pyramid Pattern

    public static void printPattern(int n){
        int num=0;
        for(int i=1; i<=n ; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
