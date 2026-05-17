package Basic_recursion;

import java.util.Scanner;

public class A {

    public  static void pritingNumber(int num) {
        if (num == 0) return ;

        pritingNumber(num - 1);
        System.out.print(num+" ");

    }


    public static void main(String[] args) {
        //prinitng number from 1 to n times
        Scanner s=new Scanner(System.in);

        int n = s.nextInt();
         pritingNumber(n);
    /*    for (int i = 1 ; i<=n ; i++)
        {
            System.out.print(i+" ");
        }*/
    }
}
