package A_Patterns;

public class nm3 {
       public static void reverse(int[] arr) {
            int start = 0;
            int end = arr.length-1;

            while(start<end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2,1};
        reverse(arr);
        for (int a : arr)
        {
            System.out.print(a+" ");
        }
    }

}

