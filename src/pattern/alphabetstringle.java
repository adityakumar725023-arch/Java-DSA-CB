package pattern;

import java.util.Scanner;

public class alphabetstringle {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n= sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print((char) (i+64)+" ");

            }
            System.out.println();
        }
    }
}
