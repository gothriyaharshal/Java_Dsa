package B_Number_Pattern;

import java.util.Scanner;

/*
E

D E

C D E

B C D E

A B C D E
*/



public class printing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your row");
        int row = scanner.nextInt();
        System.out.println("Enter your column");
        int column = scanner.nextInt();


        System.out.println("enter your character");


        char ch ='D';
        for (int i = 1 ; i<=row ; i++)
        {
            char t = (char)(ch - i + 1);
            for (int j = 1 ; j<=i ; j++)
            {
                System.out.print(t);
               t++;
            }

            System.out.println();
        }

    }
}
