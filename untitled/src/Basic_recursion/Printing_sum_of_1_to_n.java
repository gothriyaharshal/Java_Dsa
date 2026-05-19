package Basic_recursion;

import java.util.Scanner;

public class Printing_sum_of_1_to_n {

   public static int sum(int num)
   {
       if(num==1) return 1;

       return sum(num-1)+num;
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");

        int num = scanner.nextInt();

        int otp = sum(num);
        System.out.println(otp);
    }
}
