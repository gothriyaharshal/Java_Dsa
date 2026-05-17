package A_Patterns;

import java.util.Scanner;

public class H_BuuterFly {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your row");
        int row = scanner.nextInt();
        System.out.println("Enter your column");
        int column = scanner.nextInt();

        for (int i = 1 ; i<=row ; i++)
        {
            //first half
            for (int j = 1; j<=i ; j++)
            {
                System.out.print("*");
            }

            //printng spaces

            for (int space =1 ;space<=2*(row-i) ; space++)
            {
                System.out.print(" ");
            }
            //printing right half

            for (int r = i ; r>=1 ; r--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
