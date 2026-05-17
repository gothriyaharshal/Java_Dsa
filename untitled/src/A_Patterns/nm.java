package A_Patterns;

import java.util.HashMap;
import java.util.Scanner;

public class nm {

    public static int whileLoop(int d) {
        int start = d;
        int count = 0;
        int num = 50 ;
        int sum = 0 ;

        while(num>count)
        {
            if(start % 10 == d)
            {
               sum = sum + start;
               count++;
            }
            start++;
        }
     return  sum;
    }
    public static void main(String[] args) {
    int sum =   nm.whileLoop(1);
        System.out.println(sum);
    }
}
