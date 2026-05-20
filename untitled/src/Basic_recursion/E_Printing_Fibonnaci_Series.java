package Basic_recursion;

import java.util.Scanner;

public class E_Printing_Fibonnaci_Series {
    public static int fibonnaci_series(int num)
    {
        if(num==1||num==0) return num;
        return fibonnaci_series(num-1)+fibonnaci_series(num-2);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your range");

        int num = scanner.nextInt();

        int output = fibonnaci_series(num);
        System.out.println("Ans is => "+ output);
    }
}
