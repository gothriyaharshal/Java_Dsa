package StringPAtterns;

import java.util.Scanner;

public class D_Basic_String {
    public static void main(String[] args) {
      /*  A
                ABA
        ABCBA
                ABCDCBA
        ABCDEDCBA*/


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your row");
        int row = scanner.nextInt();

        System.out.println("Enter your column");
        int column = scanner.nextInt();

        for (int i =1 ; i<=row ; i++)
        {
            char ch = 'A';

            for (int spaces = 1 ; spaces<=row-i ; spaces++)
            {
                System.out.print(" ");
            }

            for (int j= 1 ; j<=i ; j++)
            {
                System.out.print(ch);
                ch++;
            }
            ch--;
            ch--;

            for (int k = i-1 ; k>=1 ; k--)
            {
                System.out.print(ch);
                ch--;
            }
            System.out.println();

        }

    }
}
