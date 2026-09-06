package pattern;

import java.util.Scanner;

public class printstar {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of rows & columns");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
