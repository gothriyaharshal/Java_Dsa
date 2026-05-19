package Basic_recursion;

import java.util.Scanner;

public class Printing_N_to_1 {
    public static void printing(int n)
    {
        if(n==0) return;

        System.out.print(n+" ");

        printing(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");

        int num = scanner.nextInt();

        printing(num);


    }
}
