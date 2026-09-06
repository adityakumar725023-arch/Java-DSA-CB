package pattern;

import java.util.Scanner;

public class alphanumericulta {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                if (i % 2 != 0)
                    System.out.print((char)(i+64)+" ");
else
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}