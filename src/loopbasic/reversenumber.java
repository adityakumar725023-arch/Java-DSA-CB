package loopbasic;

import java.util.Scanner;

public class reversenumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int rev=0;
        int lastdigit=0;
        while (n!=0){
            lastdigit=n%10;
            rev=rev*10;
            rev=lastdigit+rev;
            n=n/10;
        }

        System.out.println(rev);
    }

}
