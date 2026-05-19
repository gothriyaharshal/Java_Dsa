package Basic_math;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class A_Printing_All_Factors {

    public static int[] factors(int num)
    {
        int count = 1 ;

        for (int i = 1 ; i<=num ; i++)
        {
           if(num%i == 0)
           {
               count++;
           }
        }

        int newArray[] = new int[count-1];
        int index = 0;


        for (int i = 1; i<=num ; i++)
        {
            if(num%i == 0)
            {
                newArray[index]=i;
                index++;
            }
        }

        return newArray;
    }


    public static void main(String[] args) {
/*
        You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.



                A number which completely divides another number is called it's divisor.


        Example 1

        Input: n = 6

        Output = [1, 2, 3, 6]
*/
  Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();

        int[] list = factors(a);

        for (int ans : list)
        {
            System.out.println(ans);
        }
    }
}
