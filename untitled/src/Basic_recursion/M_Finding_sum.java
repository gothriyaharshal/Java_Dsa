package Basic_recursion;

import java.util.Scanner;

public class M_Finding_sum {

    public static int summ(int[] arr , int k)
    {

        if(k==arr.length) return 0;
        //2 3 4 5
        int temp = summ(arr,k+1);
        return temp+arr[k];
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int i = 0;

        int sum = summ(arr, i);

        System.out.println(sum);
    }
}
