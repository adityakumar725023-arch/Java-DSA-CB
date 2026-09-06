package conditional;

import java.util.Scanner;

public class evenodd {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number:");
        int n= sc.nextInt();
        if(n%2==0){
            System.out.println("the number you entered is even");}
          else  {
            System.out.println("the number you entered is odd");
        }
    }
}
