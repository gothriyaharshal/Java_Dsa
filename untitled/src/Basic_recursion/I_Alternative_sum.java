package Basic_recursion;

import java.util.Scanner;

public class I_Alternative_sum {


    public static int sum(int num) {

        if(num==0) return 0;

        int temp = sum(num-1);

        if(num%2==0)
        {
            return temp-num;
        }
        else {
            return temp+num;
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
       int o= sum(n);
        System.out.println(o);

    }
}
