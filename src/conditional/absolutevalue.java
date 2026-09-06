package conditional;

import java.util.Scanner;

public class absolutevalue {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the any integer");
        int n= sc.nextInt();
        if(n<0){
            n=n*(-1);
        }
        System.out.println("the absolute value is :"+n);
    }
}
