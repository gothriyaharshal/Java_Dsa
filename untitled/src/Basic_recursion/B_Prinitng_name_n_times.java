package Basic_recursion;

import java.util.Scanner;

public class B_Prinitng_name_n_times {

    public static void printing_name(String s, int n)
    {
            if(n==0) return;

            printing_name(s,n-1);
           System.out.println(s);
    }




    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your name which you want to print n times");

        String s = scanner.nextLine();

        System.out.println("Enter how many times you wants to print your name");
        int n = scanner.nextInt();
        printing_name(s,n);
    }
}
