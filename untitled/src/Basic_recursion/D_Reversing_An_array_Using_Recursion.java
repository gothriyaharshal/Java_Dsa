package Basic_recursion;

import java.util.Scanner;

public class D_Reversing_An_array_Using_Recursion {

   public static void reversing_using_recursion(int[] arr,int start , int end)
   {
       if(start>=end) return;

       int temp = arr[start];
       arr[start] = arr[end];
       arr[end] = temp;

       reversing_using_recursion(arr,start+1,end-1);
   }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of your array");
        int length = scanner.nextInt();

        System.out.println("Enter your array element element");
        int[] arr = new int[length];

        for (int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Before printing array");
        for (int a : arr)
        {
            System.out.print(a+" ");
        }

        reversing_using_recursion(arr,0,arr.length-1);
        System.out.println();
        System.out.println("After reversing array");

        for (int b : arr)
        {
            System.out.print(b+" ");
        }

    }
}
