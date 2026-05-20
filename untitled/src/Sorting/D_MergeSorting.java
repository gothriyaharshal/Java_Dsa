package Sorting;

import java.util.Scanner;

public class D_MergeSorting {


    public static  void  mergeginG(int[] arr,int start ,int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[i + start];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = arr[i + mid + 1];
        }


        int k = start;
        int i = 0;
        int j = 0;

        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                k++;
                i++;
            }

            else{
                arr[k] = right[j];
                k++;
                j++;
            }

        }
        while (i<n1)
        {
            arr[k] = left[i];
            k++;
            i++;
        }

        while (j<n2)
        {
            arr[k] = right[j];
            k++;
            j++;
        }




    }
    public static void mergeSort(int[] arr,int start , int end) {

        if (start>=end) return;

            int mid = (start+end)/2;

            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);

            mergeginG(arr,start,mid,end);

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

        mergeSort(arr,0,arr.length-1);

        System.out.println();
        System.out.println("After applying Sorting");
        for (int i : arr)
        {
            System.out.print(i+" ");
        }

    }
}
