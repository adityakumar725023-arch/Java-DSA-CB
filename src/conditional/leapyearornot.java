package conditional;

import java.util.Scanner;

public class leapyearornot {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the year");
        int  n= sc.nextInt();
        if(n%4==0){
            System.out.println("this year is leap year");
        }
        else {
            System.out.println("this year is not a leap year");
        }
    }
}
