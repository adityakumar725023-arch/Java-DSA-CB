package loopbasic;

import java.util.Scanner;

public class printnumber {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
       for (int i=1;i<=n;i++){
           System.out.println(i);
       }
    }
}
