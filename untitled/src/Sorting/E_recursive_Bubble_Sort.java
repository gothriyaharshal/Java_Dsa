package Sorting;

import java.util.Scanner;

public class E_recursive_Bubble_Sort {

    public static void bubbleSort(int[] arr) {




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

