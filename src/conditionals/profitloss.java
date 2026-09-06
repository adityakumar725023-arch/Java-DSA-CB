package conditionals;

import java.util.Scanner;

public class profitloss {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter cost price:");
        int cp= sc.nextInt();
        System.out.println("enter selling price");
        int sp= sc.nextInt();
        if(sp>cp){
            System.out.print("you a profit is :");
            System.out.println(sp-cp);
        }
        else { //if(sp<cp)
            System.out.println("you loss is :");
            System.out.println(sp-cp);
        }

    }
}
