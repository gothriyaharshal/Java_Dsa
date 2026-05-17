package StringPAtterns;

import java.util.Scanner;

public class c_Basic_String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your row");
        int row = scanner.nextInt();

        System.out.println("Enter your column");
        int column = scanner.nextInt();
        char ch = 'A';
        for (int i = 1 ; i<=row ; i++)
        {
            for (int j = 1 ; j<=i ; j++)
            {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}
