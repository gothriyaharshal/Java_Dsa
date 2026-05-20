package Sorting;

import java.util.Scanner;

public class C_Insertion_sort {

    public static void insertionSort(int[] arr) {
        int  j ;
        for (int i = 1 ; i<arr.length ; i++)
        {
            j = i;

            while (j>0 && arr[j-1]>arr[j])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
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

        insertionSort(arr);

        System.out.println();
        System.out.println("After applying Sorting");
        for (int i : arr)
        {
            System.out.print(i+" ");
        }

    }
}
