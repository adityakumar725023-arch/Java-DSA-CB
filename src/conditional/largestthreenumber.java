package conditional;

import java.util.Scanner;

public class largestthreenumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int a = sc.nextByte();
        System.out.println("enter the second number:");
        int b = sc.nextByte();
        System.out.println("enter the third number:");
        int c = sc.nextByte();
        if (a > b) {
            if (a > c) {
                System.out.println(a + " is largest");
            } else {
                System.out.println(c + "is largest");
            }
        } else {
            if (b > c) {
                System.out.println(b + "is largest");
            } else {
                System.out.println(c + "is largest");
            }
        }
    }
}
