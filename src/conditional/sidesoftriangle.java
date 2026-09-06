package conditional;

import java.util.Scanner;

public class sidesoftriangle {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first side:");
        int a= sc.nextByte();
        System.out.println("enter the second side:");
        int b= sc.nextByte();
        System.out.println("enter the third side:");
        int c= sc.nextByte();
        if ((a+b)>c&& (b+c)>a && (c+a)>b){
            System.out.println("valid triangle");
        }
        else {
            System.out.println("not valid tringale");
        }
    }
}
