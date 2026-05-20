package Basic_recursion;

import java.util.Scanner;

public class L_Printing_Maximus_value_Of_Arrat {

    public static int printingRecursivly(int[] arr, int n) {

        if(n==arr.length-1) {
            return arr[n];
        }


        int small = printingRecursivly(arr,n+1);

        return Math.max(small,arr[n]);

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your array length");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter your array elements");

        for (int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = scanner.nextInt();
        }
        int length = arr.length-1;

        int max = printingRecursivly(arr,length);

        System.out.println(max);

    }
}
