package Basic_recursion;

import java.util.Scanner;

public class Checking_String_is_Palimdrome_or_not_By_recursion {

    public static void helper(char[] arr , int start , int end)
    {
        if(start>=end) return;

        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        helper(arr,start+1,end-1);
    }




    public static boolean palindromeCheck(String s) {

        //your code goes here
        String temp = s;
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length-1;

        helper(ch,start,end);
        String newString = new String(ch);

        if(newString.equals(temp))
        {
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your string");

        String s = scanner.nextLine();

        boolean b = palindromeCheck(s);

        if(b)
        {
            System.out.print("string is palimdrome");
        }
        else {
            System.out.println("String is not an palimdrome");
        }
    }
}
