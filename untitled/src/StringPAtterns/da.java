package StringPAtterns;

import java.util.Scanner;

public class da {
    public static void main(String[] args) {

/*
        E         A B C D E
                  B C D E
        D E       C D E
                  D E
        C D E     E

        B C D E

        A B C D E    */



            Scanner sc = new Scanner(System.in);

            System.out.println("Enter rows:");
            int row = sc.nextInt();

            for (int i = row; i >=1; i--) {

                char ch = (char) ('A' + i - 1);

                for (int j = i; j <= row; j++) {
                    System.out.print(ch + " ");
                    ch++;
                }

                System.out.println();
            }
        }
}

