package Basic_recursion;

import java.util.Scanner;

public class F_SumOfDigit_USing_Recursion {

    public static int sumOfDigit(int num) {

        if(num==0) return 0;

        int temp = sumOfDigit(num/10);


        return temp + (num%10);
/*123
        12
            */

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int sum = sumOfDigit(a);

        System.out.println(sum);
    }
}
