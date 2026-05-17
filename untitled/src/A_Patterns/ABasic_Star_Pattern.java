package A_Patterns;

import java.util.Scanner;

public class ABasic_Star_Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your row");
        int row = scanner.nextInt();
        System.out.println("Enter your column");
        int column = scanner.nextInt();

        for (int i = 1 ; i<=row ; i++)
        {
            for (int  j = 1 ; j<column ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
