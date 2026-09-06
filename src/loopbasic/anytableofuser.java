package loopbasic;

import java.util.Scanner;

public class anytableofuser {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num= sc.nextByte();
        for (int i=1;i<=10;i++){
            System.out.println(num+"x"+i+"="+(num*i));
        }
    }
}
