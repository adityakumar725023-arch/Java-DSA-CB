package basicsofjava;

import java.util.Scanner;

public class areaofacircle {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of circle");
        double r= sc.nextInt();
        double pi=3.14;
        double a=pi*r*r;
        System.out.println("the area of circle is: "+a);
    }
}
