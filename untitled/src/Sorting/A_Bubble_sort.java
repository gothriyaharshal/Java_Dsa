package Sorting;

import java.util.Scanner;

public class A_Bubble_sort {

    public static void bubbleSort(int[] arr)
    {
        boolean swapped = false;

        for(int i = 0 ; i<arr.length-1 ; i++)
        {
            for (int j = 0 ; j<arr.length-i-1 ; j++)
            {
                if(arr[j+1]<arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped)
            {
                return;
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

        bubbleSort(arr);

        System.out.println();
        System.out.println("After applying Sorting");
        for (int i : arr)
        {
            System.out.print(i+" ");
        }

    }
}
