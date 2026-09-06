package loopbasic;

import java.util.Scanner;

public class countdigits {
    static void main() {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextByte();
        int count=0;
        if (n==0)count++;
        while (n!=0)
        {
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}


