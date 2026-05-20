package Sorting;

import java.util.Scanner;

public class B_Selection_sorting {

    public static void selectionSort(int[] arr) {
       /*5 4 3 2 1

          min = i = 5    j =4

          5>4   swap....
                */

        int min_index;
        for (int i = 0 ; i<arr.length ; i++)
        {
            min_index = i;

            for (int j = i+1 ; j<arr.length ; j++)
            {
                if(arr[min_index]>arr[j])
                {
                    min_index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index]= temp;


        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your length");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0 ; i<arr.length ; i++)
        {
            arr[i]=scanner.nextInt();
        }

        System.out.println("Before Sorting");
        for (int i : arr)
        {
            System.out.print(i+" ");
        }

        selectionSort(arr);

        System.out.println();
        System.out.println("After applying Sorting");
        for (int i : arr)
        {
            System.out.print(i+" ");
        }

    }
}
