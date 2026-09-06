package loopbasic;

import java.util.Scanner;

public class gpupton {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n= sc.nextByte();
        int a=3,r=4;
        for (int i = 0; i <=n ; i++) {
            System.out.println(a+" ");
            a*=r;
        }
    }
}
