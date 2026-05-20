package Basic_recursion;

import java.util.Scanner;

public class L_Printing_Maximus_value_Of_Arrat {

    public static int findingMax(int[] arr , int n)
    {
        if(n<0) return arr[0];

        int max  = Integer.MIN_VALUE;
        for (int i = 0 ; i<n ; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return findingMax(arr,n-1);
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

        int max = findingMax(arr,length);

        System.out.println(max);

    }
}
