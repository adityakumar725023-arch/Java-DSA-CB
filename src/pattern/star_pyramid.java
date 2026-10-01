package pattern;

import java.util.Scanner;

public class star_pyramid {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        for (int i = n; i <= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.println(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}

