package Basic_recursion;

import java.util.Scanner;

public class K_Printing_Array_recursivly {

    public static void printingRecursivly(int[] arr, int n) {

        if(n==arr.length) {
            return;
        }

        System.out.println(arr[n]);
        printingRecursivly(arr,n+1);

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

        printingRecursivly(arr,0);


    }
}
