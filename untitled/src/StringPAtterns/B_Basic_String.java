package StringPAtterns;

import java.util.Scanner;

public class B_Basic_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your row");
        int row = scanner.nextInt();

        System.out.println("Enter your column");
        int column = scanner.nextInt();

        for (int i = row ; i>=1 ; i--)
        {
            char ch = 'A';

            for (int j = 1 ; j<=i ; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
