package conditionals;

import java.util.Scanner;

public class threedigitnunber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n= sc.nextInt();
        if (n>99 && n<1000){
            System.out.println("this is a three digit number");
        }
        else {
            System.out.println("this is not a three digit number");
        }
    }
}
