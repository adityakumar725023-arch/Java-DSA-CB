package pattern;

import java.util.Scanner;

public class alphabetsqure {
    static void main() {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n");
        int n=s.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print((char) (j+64)+" ");
            }
            System.out.println();
        }
    }
}
