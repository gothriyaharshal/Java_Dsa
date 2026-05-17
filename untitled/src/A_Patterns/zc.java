package A_Patterns;

import java.util.Scanner;

public class zc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your row");
        int row = scanner.nextInt();
        System.out.println("Enter your column");
        int column = scanner.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int s = 1; s <= row - i; s++) {
                System.out.print(" ");
            }

        //first half
        for (int j = i; j >= 1; j--) {
            System.out.print(j + " ");
        }

        //Second half
        for (int k = 2; k <= i; k++) {
            System.out.print(k + " ");
        }

        System.out.println();

    }
}
}
