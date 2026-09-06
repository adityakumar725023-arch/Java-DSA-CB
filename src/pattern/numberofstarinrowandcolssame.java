package pattern;

import java.util.Scanner;

public class numberofstarinrowandcolssame {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows:");
        int n= sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
