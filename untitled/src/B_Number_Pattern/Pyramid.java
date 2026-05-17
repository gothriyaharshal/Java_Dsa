package B_Number_Pattern;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your row");
        int row = scanner.nextInt();
        System.out.println("Enter your column");
        int column = scanner.nextInt();




        for (int i = 1 ; i<=row ; i++)
        {
            char ch = 'A';

            for(int space = 1  ; space<=row-i ; space++)
            {
                System.out.print(" ");
            }

            for (int j = 1 ; j<= i ; j++ )
            {
                System.out.print(ch);
                ch++;
            }
             ch--;
            for (int j = i-1 ; j>= 1 ; j-- )
            {
                ch--;
                System.out.print(ch);

            }


            System.out.println();

        }



    }
}
