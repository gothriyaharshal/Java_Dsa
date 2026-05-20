package Basic_recursion;

import java.util.Scanner;

public class G_Calculating_Power {

    public static int power(int  p , int q)
    {
        if(q == 0 ) return 1;

        int temp = power(p,q-1);

        return temp*p;
    }


    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();

    int q = scanner.nextInt();

    int output = power(a, q);


        System.out.println(output);
    }
}



