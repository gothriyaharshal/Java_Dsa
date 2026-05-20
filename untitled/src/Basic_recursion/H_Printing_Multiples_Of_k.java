package Basic_recursion;

import java.util.Scanner;

public class H_Printing_Multiples_Of_k {

    public static void K_Multiples(int num , int times)
    {
        if(times < 1) return ;

        K_Multiples(num,times-1);

        System.out.print(num*times+" ");
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int q = scanner.nextInt();

        K_Multiples(a, q);

    }
}
