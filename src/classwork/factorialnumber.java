package classwork;

import java.util.Scanner;

public class factorialnumber {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        long fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("factorial of"+n+"="+fact);
    }
}
