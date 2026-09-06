package loopbasic;

import java.util.Scanner;

public class productsofnonzero {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digits :");
        int n= sc.nextInt();
        int product=1;
        while (n!=0){
            int digit=n%10;
            if (digit!=0) {
                product = product * digit;
            }
            n= n/10;
        }
        System.out.println(product);
    }
}



