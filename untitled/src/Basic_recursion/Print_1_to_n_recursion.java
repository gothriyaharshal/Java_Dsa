package Basic_recursion;

import java.util.Scanner;

public class Print_1_to_n_recursion {

   public static void printing(int n)
   {
      if(n==0)
      {
       //System.out.println(1);
          return;
      }
      printing(n-1);
       System.out.print(n+" ");

   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");

        int num = scanner.nextInt();

        printing(num);


    }
}
