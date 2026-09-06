package conditionals;

import java.util.Scanner;

public class divisibleby5or3 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number :");
        int n= sc.nextByte();
        if(n%5==0  && n%3==0){
            System.out.println("this number is divible by 5 and 3");
        }
        else {
            System.out.println("this number is not divible by 5 and 3");
        }
    }
}
