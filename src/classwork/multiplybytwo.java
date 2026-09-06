package classwork;

import java.util.Scanner;

public class multiplybytwo {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num= sc.nextInt();
        int result=num<<1;
        System.out.println("result after multiplying by 2:"+result);
    }
}
