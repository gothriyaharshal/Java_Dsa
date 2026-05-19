package Bit_MAniPulation;

import java.util.Scanner;

public class A_Cheking_Even_Or_not {

    public static boolean chekingEvenOrNot(int a)
    {
        if((a & 1) == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = scanner.nextInt();
        boolean ans = chekingEvenOrNot(a);
        if(ans) System.out.println("Even number");
        else System.out.println("Odd number");
    }
}
