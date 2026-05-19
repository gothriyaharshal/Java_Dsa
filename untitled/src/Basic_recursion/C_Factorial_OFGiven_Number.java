package Basic_recursion;

import java.util.Scanner;

public class C_Factorial_OFGiven_Number {

    public static int fac(int num)
    {
        if(num==1) return 1;

        return fac(num-1)*num;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");

        int num = scanner.nextInt();

        int factorial = fac(num);

        System.out.println(factorial);
    }
}
