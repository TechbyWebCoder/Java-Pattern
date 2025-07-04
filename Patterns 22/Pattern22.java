//Pattern 22
//Hollow Hourglass Pattern

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Value Of N : ");
        int n = scanner.nextInt();

        scanner.close();

        //Call The Method From Another function
        printpattern(n);
    }

    //algorithm Of Hollow hourglass Pattern

    public static void printpattern(int n){
        int totalcols = 2*n-1;

        //top half(inverted hollow Triangle)
        for(int i=0; i<n; i++){
            for(int s=0; s<i; s++){
                System.out.print(" ");
            }

            for(int j=0; j<totalcols -2*i; j++){
                if(j==0 || j== totalcols-2*i-1 || i==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
                System.out.println();
        }

            //bottom half(upright hollow triangle)

            for(int i =n-2; i>=0; i--){
                for(int s=0; s<i; s++){
                    System.out.print(" ");
                }

                for(int j=0; j<totalcols-2*i ; j++){
                    if(j==0 || j== totalcols-2*i-1 || i==0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
        }
    } 
