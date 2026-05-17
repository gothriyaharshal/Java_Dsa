package B_Number_Pattern;

import java.util.Scanner;

public class Zero_one_printing {
    public static void main(String[] args) {
/*
        1

        0 1

        1 0 1

        0 1 0 1

        1 0 1 0 1

*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row");
        int row = scanner.nextInt();
        System.out.println("Enter column");
        int column = scanner.nextInt();

       for( int i=1; i<=row; i++){
           for( int j=1; j<=i; j++){
               int sum= i+j;
               if(sum % 2==0){
                   System.out.print("1");
               } else{
                   System.out.print("0");
               }
           }
           System.out.println();
       }
    }
}
