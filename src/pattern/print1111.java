package pattern;

import java.util.Scanner;

public class print1111 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}



