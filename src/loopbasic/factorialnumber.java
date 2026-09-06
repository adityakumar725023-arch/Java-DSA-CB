package loopbasic;

import java.util.Scanner;

public class factorialnumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
           // System.out.println(i + "!=" + fact);
        }
        System.out.println(fact);
    }
}