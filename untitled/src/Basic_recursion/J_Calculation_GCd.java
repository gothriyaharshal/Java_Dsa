package Basic_recursion;

import java.util.Scanner;

public class J_Calculation_GCd {


    public static int gcd(int n , int n2)
    {
        if (n2==0) return n;

        return gcd(n2,n%n2);

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int n2 = scanner.nextInt();

        int o= gcd(n,n2);
        System.out.println(o);

    }
}
