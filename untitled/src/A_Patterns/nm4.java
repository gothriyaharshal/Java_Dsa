package A_Patterns;

import java.util.Scanner;

public class nm4 {

  public  int summition(int digit)
    {

        int sum = 0;
        int start = 1 ;  // 11%10.....
        int count = 0;

        while (count<50)
        {
            if(start%10 == digit)
            {
                sum = sum + start;
                count++;
            }
            start++;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your digit");
          int digit  = scanner.nextInt();

         nm4 n= new nm4();
        int a = n.summition(digit);
        System.out.println(a);

    }
}
