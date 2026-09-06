package loopbasic;

import java.util.Scanner;

public class printthechar {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("print the characters");
        int n= sc.nextInt();
        for (int i=65;i<=90;i++){
            System.out.println(i+" "+(char)i);
        }
       // for (int i = 97; i <=122; i++) {
          //  System.out.println(i+" "+(char)i);

       // }
    }
}
