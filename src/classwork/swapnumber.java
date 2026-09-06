package classwork;

import java.util.Scanner;

public class swapnumber {
    static void main() {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the fist number:");
        a=sc.nextInt();
        System.out.println("enter the second number:");
        b=sc.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after swapping:");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
